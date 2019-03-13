CREATE DATABASE IF NOT EXISTS tmdb_oozie;

USE tmdb_oozie;

DROP TABLE IF EXISTS tmdb_movies;

create table tmdb_movies(
budget bigint,
genre array<string>,
homepage varchar(255),
movie_id int,
keyword array<string>,
original_language varchar(20),
original_title varchar(255),
overview varchar(2000),
popularity float,
productioncompany array<string>,
productioncountry array<string>,
release_date varchar(255),
revenue bigint,
runtime float,
spokenlanguages array<string>,
status varchar(255),
tagline varchar(2000),
title varchar(255),
vote_average float,
vote_count int)
row format delimited
fields terminated by '\001'
collection items terminated by '\002';
