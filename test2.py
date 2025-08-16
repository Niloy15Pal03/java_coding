from scholarly import scholarly
import json
def fetch_by_scholar_id(scholar_id):
    # Fetch basic author info by scholar ID
    author = scholarly.search_author_id(scholar_id)
    filled_author = scholarly.fill(author, sections=["indices", "counts", "publications"])

    # Extract key data
    data = {
        "name": filled_author.get("name"),
        "affiliation": filled_author.get("affiliation"),
        "h_index": filled_author.get("hindex"),
        "i10_index": filled_author.get("i10index"),
        "citations_total": filled_author.get("citedby"),
        "citations_per_year": filled_author.get("citedby_per_year"),
        "publications": []
    }

    # Add limited publication data (optional: limit to first N)
    for pub in filled_author.get("publications", [])[:5]:  # limit to 5 for demo
        pub_filled = scholarly.fill(pub)
        data["publications"].append({
            "title": pub_filled.get("bib", {}).get("title"),
            "year": pub_filled.get("bib", {}).get("pub_year"),
            "citations": pub_filled.get("num_citations"),
            "author": pub_filled.get("bib", {}).get("author"),
            "venue": pub_filled.get("bib", {}).get("venue"),
        })

    return data

# Replace with your Scholar ID
scholar_id = "4bahYMkAAAAJ"  # Example ID
author_data = fetch_by_scholar_id(scholar_id)

# Print JSON output
print(json.dumps(author_data, indent=4))
