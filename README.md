# search
                           Search Spring REST Service

Steps to Build and Run this project

Database Table creation
1. Creating the Oracle Table - run the EmployeeTable.sql from /resources/ folder

Steps to build and deploy
1. checkout the project
2. import the project in eclipse via "Existing Maven Project"
3. change the database properties in the db.properties files under /resources/ folder
3. build the project
4. deploy the employee-V1.war
5. this will deploy the REST service
6. this REST service will support GET and POST
7. to test this you can access the SearchPage.html as just a html page not from the server
	7a. before accessing the html page change the "baseUrl" in the html page to your deployed location

what is missing

1. JUnit Testing
2. Field Validation