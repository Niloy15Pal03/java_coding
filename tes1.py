from scholarly import scholarly

def get_h_index(scholar_id):
    try:
        print(f"Fetching profile for ID: {scholar_id}")
        author = scholarly.search_author_id(scholar_id)
        author = scholarly.fill(author, sections=["indices"])

        h_index = author.get("hindex")
        i10_index = author.get("i10index")

        print(f"H-Index: {h_index}")
        print(f"i10-Index: {i10_index}")

    except Exception as e:
        print("Something went wrong:", e)

# Test with an example Scholar ID
# Replace with your own scholar ID if needed
# Example profile: https://scholar.google.com/citations?user=4bahYMkAAAAJ&hl=en
scholar_id = "1UE6AW8AAAAJ"  # Replace with any real ID to test
get_h_index(scholar_id)
