CREATE DATABASE IF NOT EXISTS fiveguyz_2db;

USE fiveguyz_2db;

DROP TABLE IF EXISTS the_big_one;

create table if not exists the_big_one (
    budget bigint, 
    web_homepage string, 
    movie_id int, 
    orig_lang string, 
    orig_title string, 
    overview string, 
    popularity float, 
    release_date string, 
    revenue bigint, 
    runtime int, 
    spoken_lang string, 
    status string, 
    tagline string, 
    curr_title string, 
    vote_ave float, 
    vote_count int, 
    genres array<string>,
    keywords array<string>,
    prod_companies array<string>, 
    prod_countries array<string>)
row format delimited
fields terminated by '\001'
collection items terminated by '\012';

DROP TABLE IF EXISTS cast_alt;

create table if not exists cast_alt (
    index_id int, 
    movie_id int,
	cast_id int,
    name_char string,
    gender int, 
    person_id int,
    name string,
    order_of_cast int)
row format delimited
fields terminated by '\001';

DROP TABLE IF EXISTS crew_alt;

create table if not exists crew_alt (
    index_id int, 
    movie_id int,
    department string,
    gender int, 
    person_id int,
    job string,
    name string)
row format delimited
fields terminated by '\001';

DROP TABLE IF EXISTS genres;

create table if not exists genres (
    index_id int, 
    movie_id int,
    genres_name string)
row format delimited
fields terminated by '\001';
