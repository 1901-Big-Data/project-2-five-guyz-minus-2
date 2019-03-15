Contributors: Luke Davis, Jason Douglas, Anthony Nguyen

Our project consists of finding a large set of raw data, transforming that data into a form applicable to Hive, using Hive to perform business-relevant analyis, and finally visualizing and presenting that data in an intuitive and easy to understand way.

The following is a more detailed step-by-step flow of our project:

1. find an interesting dataset that is large and at least semi-structured
2. formulate at least 5 interesting or business-relevant questions to be answered using the data from the dataset
3. setup an RDS with a schema that can fit the dataset
4. clean the data
5. use Sqoop to transport the data to the RDS
6. use Sqoop to transport the data from RDS to Hive
7. use Hive on the dataset to answer the questions
8. output findings into a file
9. use visualization software of choice to visualize the data
10. put the project story and findings into an elegant powerpoint presentation

Our chosen dataset: meta-data for ~5000 movies
Source: https://www.kaggle.com/tmdb/tmdb-movie-metadata

Posed Questions:
1. Genre popularity trends since 1990: linear regression model and correlation coefficients
2. Male vs female top billing popularity trends since 1990
