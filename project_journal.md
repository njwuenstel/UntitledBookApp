
Last week:

1. Finished figuring out JAXB stuff and prepared materials for the presentation
2. Messed around with some of the returns from GoodReads and discovered that they don't validate their xmls
  - one contained reserved characters and crashed the JAXB client.



This week:

1. Completed searches which return URLs to GoodReads ws.
  -Book search by title, ISBN
  -Author search by name
  -search by GoodReads ID# (this search likely won't be exposed but may be needed since the book search doesn't return an ISBN
    but the goodreads id search does)
2. Mapped the book search with XJC
3.

Goals for next week:
1. Continue creating searches and mapping the returns.
2. If xmls come back dirty figure out a way to clean them up.
3. Attempt to format and pass objects to the database using JDBC.
  -create a table for book, add a few fields, write records from the search.