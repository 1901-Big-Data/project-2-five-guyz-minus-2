USE fiveguyz_2db;

INSERT OVERWRITE DIRECTORY '/user/cloudera/output42/Question1/'
select genres.genres_name, YEAR(the_big_one.release_date) as test, avg(the_big_one.popularity) 
from the_big_one join genres on the_big_one.movie_id=genres.movie_id
group by YEAR(the_big_one.release_date), genres.genres_name
sort by genres.genres_name, test;

INSERT OVERWRITE DIRECTORY '/user/cloudera/output42/Question2/'
select cast_alt.gender as gender, YEAR(the_big_one.release_date) as what_year, avg(the_big_one.popularity) as yearlyAve 
from the_big_one join cast_alt on the_big_one.movie_id=cast_alt.movie_id
where order_of_cast = 0
group by YEAR(the_big_one.release_date), cast_alt.gender
sort by cast_alt.gender, what_year;
