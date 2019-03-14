USE tmdb_oozie;

DROP TABLE IF EXISTS tmdb_testbudget;

CREATE TABLE tmdb_testbudget
LOCATION '/user/cloudera/HData/oozietest/'
AS 
select a.* from
    (
    select title from tmdb_credits a 
    lateral view inline(a.moviecast) t as actor, character, gender
    where t.actor = "Leonardo DiCaprio"
    ) a
    join tmdb_movies b
    on a.title = b.title
    where b.budget > 10000000;
