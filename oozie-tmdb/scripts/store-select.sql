USE tmdb_oozie;

CREATE TABLE tmdb_testbudget
LOCATION '/user/cloudera/HData/oozietest/'
AS SELECT title, budget FROM tmdb_movies LIMIT 10;
