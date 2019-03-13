CREATE DATABASE IF NOT EXISTS fiveguyz_2db;

USE fiveguyz_2db;

DROP TABLE IF EXISTS the_big_one;

create external table if not exists the_big_one (
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
collection items terminated by ','
LOCATION '/user/cloudera/HData/HiveTables/project2';

DROP TABLE IF EXISTS cast_alt;

create external table if not exists cast_alt (
    index_id int, 
    movie_id int,
    department varchar(200),
    gender int, 
    person_id int,
    job varchar(200),
    name varchar(200))
row format delimited
fields terminated by ','
LOCATION '/user/cloudera/HData/HiveTables/project2';

DROP TABLE IF EXISTS crew_alt;

create external table if not exists crew_alt (
    index_id int, 
    movie_id int,
    department varchar(200),
    gender int, 
    person_id int,
    job varchar(200),
    name varchar(200))
row format delimited
fields terminated by ','
LOCATION '/user/cloudera/HData/HiveTables/project2';
