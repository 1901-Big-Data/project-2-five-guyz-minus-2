USE fiveguyz_2db;
LOAD DATA INPATH '/user/cloudera/HData/HiveTables/project2/tmdb_5000_movies_new2.csv' INTO TABLE the_big_one;
LOAD DATA INPATH '/user/cloudera/HData/HiveTables/project2/cast_alt.csv' INTO TABLE cast_alt;
LOAD DATA INPATH '/user/cloudera/HData/HiveTables/project2/crew_alt.csv' INTO TABLE crew_alt;
LOAD DATA INPATH '/user/cloudera/HData/HiveTables/project2/genres.csv' INTO TABLE genres;