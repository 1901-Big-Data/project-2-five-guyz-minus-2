USE fiveguyz_2db;

INSERT OVERWRITE DIRECTORY '/user/cloudera/output42/Question1/'
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
SELECT revenue, curr_title from the_big_one where overview like '%cat%' order by revenue;

INSERT OVERWRITE DIRECTORY '/user/cloudera/output42/Question2/'
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
SELECT revenue, curr_title from the_big_one where overview like '%dog%' order by revenue;