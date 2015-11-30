
Week 7:

1. Finished figuring out JAXB stuff and prepared materials for the presentation
2. Messed around with some of the returns from GoodReads and discovered that they don't validate their xmls
  - one contained reserved characters and crashed the JAXB client.

Week 8:

1. Completed searches which return URLs to GoodReads ws.
  -Book search by title, ISBN
  -Author search by name
  -search by GoodReads ID# (this search likely won't be exposed but may be needed since the book search doesn't return an ISBN
    but the goodreads id search does)
2. Mapped the book search with XJC

Goals for next week:
1. Continue creating searches and mapping the returns.
2. If xmls come back dirty figure out a way to clean them up.
3. Attempt to format and pass objects to the database using JDBC.
  -create a table for book, add a few fields, write records from the search.

Week 9:

1. Repackaged service classes. Added utilities for search and unmarshall
2. created xjc for BookSearch
3. some error handling.

Week 10:

1. Search utility now working after re-ordering operations.
2. Mapper working for work objects.

Week 11:

1. ported hibernate from exercise and refactored to project entities
2. catch up on logging
3. expanded db for works, stuck on join table issue.

Week 12:

1. added junits for searchUtil
2. reconfig db and tomcat for authentication
3. hibernate working for current all tables except joins.

Goals for next week:
1. MVC!
2. Expand works to include 'showWork' fields
3. Join tables

Week 13:



