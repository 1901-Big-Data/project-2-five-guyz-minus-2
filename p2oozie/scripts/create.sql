CREATE DATABASE IF NOT EXISTS fiveguyz_2db;

USE fiveguyz_2db;

DROP TABLE IF EXISTS the_big_one;

create table if not exists the_big_one (
    budget bigint, 
    web_homepage varchar(500), 
    movie_id int, 
    orig_lang varchar(5), 
    orig_title varchar(300), 
    overview varchar(1500), 
    popularity float, 
    release_date date, 
    revenue bigint, 
    runtime int, 
    spoken_lang varchar(1000), 
    status varchar(15), 
    tagline varchar(1000), 
    curr_title varchar(300), 
    vote_ave float, 
    vote_count int, 
    genres array<string>,
    keywords array<string>,
    prod_companies array<string>, 
    prod_countries array<string>)
row format delimited
fields terminated by ','
collection items terminated by ',';

DROP TABLE IF EXISTS cast_alt;

create table if not exists cast_alt (
    index_id int, 
    movie_id int,
	cast_id int,
    name_char varchar(500),
    gender int, 
    person_id int,
    name varchar(50),
    order_of_cast int)
row format delimited
fields terminated by ',';

DROP TABLE IF EXISTS crew_alt;

create table if not exists crew_alt (
    index_id int, 
    movie_id int,
    department varchar(200),
    gender int, 
    person_id int,
    job varchar(200),
    name varchar(200))
row format delimited
fields terminated by ',';

DROP TABLE IF EXISTS genres;

create table if not exists genres (
    index_id int, 
    movie_id int,
    genres_name varchar(50))
row format delimited
fields terminated by ',';