# Demo Spring Boot Project with MongoDB and JPA

## Overview

This project is a **demo Spring Boot application** that demonstrates the integration of both **MongoDB** (for NoSQL data storage) and **JPA** (for relational database interactions). The application features a simple RESTful API that allows users to interact with resources stored in MongoDB and a relational database. This setup allows developers to experiment with both MongoDB and traditional relational databases within the same project.

## Prerequisites

- **Java 17** or later
- **Maven** (for building and running the project)
- **MongoDB** (either a local instance or a MongoDB Atlas cluster)
- **Relational Database** (such as MySQL or PostgreSQL for JPA integration)

## Installation

### Clone the Repository

Start by cloning the repository to your local machine:

```bash
git clone https://github.com/dulphyj/demoMongoDB2.git
cd demo
```
Build and Run the Application
To build the application using Maven, run the following command:
```bash
mvn clean install
```
To run the application locally, use:
```bash
mvn spring-boot:run
```
By default, the application will start on http://localhost:8080.
Configuration
application.properties
Make sure to configure the application.properties file to match your local setup:
```bash
# Application name and port
spring.application.name=demo
server.port=8080

# MongoDB configuration (replace with your own connection string)
spring.data.mongodb.uri=mongodb://localhost:27017/demoDB

# JPA Database configuration (replace with your own relational database details)
spring.datasource.url=jdbc:mysql://localhost:3306/demoDB
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

# Logging level for debugging
logging.level.org.springframework=DEBUG
```
Replace the MongoDB URI and JPA database connection details with your own. For MongoDB, you can use a local instance or MongoDB Atlas. Similarly, for the JPA database, make sure the JDBC URL and credentials match your database setup.

Example MongoDB URI
```bash
spring.data.mongodb.uri=mongodb://your-mongo-username:your-mongo-password@your-cluster.mongodb.net/demoDB

```
Example JPA Database Configuration
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/demoDB
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

```
Dependencies
The project uses the following key dependencies:

Spring Boot: The core framework used to build the application.<br>
Spring Data JPA: For interacting with relational databases using JPA.<br>
Spring Data MongoDB: For integrating MongoDB as a data store.<br>
Lombok: For reducing boilerplate code in POJOs and entities.<br>
Mongo Java Driver: For interacting with MongoDB.<br>
Spring Boot Starter Web: To build REST APIs with Spring MVC.<br>
Spring Boot Starter Test: For unit testing the application.<br>
Endpoints<br>
The application exposes the following API endpoints:

CRUD Operations for MongoDB<br>
GET /api/mongodb/items - Get all items stored in MongoDB.<br>
GET /api/mongodb/items/{id} - Get an item from MongoDB by ID.<br>
POST /api/mongodb/items - Create a new item in MongoDB.<br>
PUT /api/mongodb/items/{id} - Update an item in MongoDB by ID.<br>
DELETE /api/mongodb/items/{id} - Delete an item from MongoDB by ID.<br>
CRUD Operations for JPA<br>
GET /api/jpa/items - Get all items stored in the relational database.<br>
GET /api/jpa/items/{id} - Get an item from the relational database by ID.<br>
POST /api/jpa/items - Create a new item in the relational database.<br>
PUT /api/jpa/items/{id} - Update an item in the relational database by ID.<br>
DELETE /api/jpa/items/{id} - Delete an item from the relational database by ID.<br>
Testing<br>
To run the unit tests, use the following Maven command:
```bash
mvn test
```
This will execute all the tests in the project and display the results in the console.

Swagger API Documentation
The application includes Swagger UI for easy API documentation and testing. Once the application is running, you can access Swagger UI at:
```bash
http://localhost:8080/swagger-ui.html
```
This will show an interactive interface where you can view the available endpoints and make requests directly from the browser.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Contributions
Feel free to contribute to this project by submitting issues or pull requests. For any questions or support, contact us via GitHub Issues.