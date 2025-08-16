from scholarly import scholarly

def format_scholarly_paper(pub, scholar_id=None):
    return {
        "title": pub.get("bib", {}).get("title"),
        "authors": pub.get("bib", {}).get("author"),
        "year": pub.get("bib", {}).get("pub_year"),
        "venue": pub.get("bib", {}).get("venue"),
        "citations": pub.get("num_citations", 0),
        "link": f"https://scholar.google.com/citations?view_op=view_citation&hl=en&user={scholar_id}&citation_for_view={scholar_id}:{pub.get('citation_id')}" if scholar_id and pub.get("citation_id") else None
    }

def test_fetch_by_name(name):
    try:
        # Search author
        search = scholarly.search_author(name)
        author = next(search, None)

        if not author:
            print("❌ Author not found.")
            return

        # Fill author details
        filled = scholarly.fill(author, sections=["basics", "indices", "counts", "publications"])

        print(f"\n✅ Author found: {filled.get('name')}")
        print(f"Affiliation: {filled.get('affiliation')}")
        print(f"Email domain: {filled.get('email_domain')}")
        print(f"Interests: {', '.join(filled.get('interests', []))}")
        print(f"Scholar ID: {filled.get('scholar_id')}")
        print("\n📚 Top 3 Publications:\n")

        pubs = [scholarly.fill(p) for p in filled.get("publications", [])[:3]]
        for i, pub in enumerate(pubs, 1):
            formatted = format_scholarly_paper(pub, filled.get("scholar_id"))
            print(f"{i}. {formatted['title']}")
            print(f"   Authors: {formatted['authors']}")
            print(f"   Year: {formatted['year']}")
            print(f"   Venue: {formatted['venue']}")
            print(f"   Citations: {formatted['citations']}")
            print(f"   Link: {formatted['link']}\n")

    except Exception as e:
        print(f"❌ Error: {str(e)}")

# 🔍 Test with any author name
test_fetch_by_name("Subhamita Mukherjee")
