USE tmdb_oozie;

DROP TABLE IF EXISTS tmdb_question1;
DROP TABLE IF EXISTS tmdb_question2;

CREATE TABLE tmdb_question1
LOCATION '/user/cloudera/HData/project2q1/'
AS
select a.rlsdate, singlegenre, avg(a.budget) as budget, avg(a.revenue) as revenue from
    (
    select year(release_date) as rlsdate, genre, budget, revenue from tmdb_movies group by year(release_date), genre, budget, revenue 
    ) a
    lateral view explode(a.genre) t as singlegenre
    where array_contains(a.genre, singlegenre) and a.budget > 1000
    group by a.rlsdate, singlegenre order by singlegenre, a.rlsdate;
    

CREATE TABLE tmdb_question2
LOCATION '/user/cloudera/HData/project2q1/'
AS
select a.rlsdate, singlegenre, avg(runtime) as runtime, avg(vote_average) as average from 
(
select year(release_date) as rlsdate, genre, runtime, vote_average from tmdb_movies
    lateral view explode(productioncountry) t1 as country
    where country = "US"
    group by year(release_date), genre, runtime, vote_average
) a
lateral view explode(a.genre) t2 as singlegenre
where runtime > 0
group by singlegenre, a.rlsdate order by singlegenre, a.rlsdate, runtime, average; 
