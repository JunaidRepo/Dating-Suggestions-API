Dating Suggestions API

Overview

This project is a REST API for providing dating suggestions. It is built using Spring Boot and follows a structured architecture to ensure scalability and maintainability.

Features

Provides dating recommendations based on user preferences.

Utilizes Spring Boot for backend development.

Follows RESTful principles for API design.

Key Functionalities

User Management: Allows users to register, update details, and delete their accounts.

Interest Matching: Matches users based on shared interests.

Recommendation System: Suggests potential matches based on user preferences.

Data Validation: Ensures valid user input, such as age and interest requirements.

Error Handling: Implements custom exception handling for smooth API responses.

Technology Stack

Backend: Spring Boot, Java

Database: MySQL

Build Tool: Maven

Other: Hibernate, JDBC

Setup Instructions

Prerequisites

Java 8 or later installed

Maven installed

MySQL database configured

Installation Steps

Clone the repository.

Configure database settings in application.properties.

Build the project using Maven:

mvn clean install

Run the application:

mvn spring-boot:run

API Endpoints

Method

Endpoint

Description

POST

/add

Add a new dating suggestion

POST

/addAll

Add multiple suggestions

PUT

/update

Update an existing entry

DELETE

/delete/{id}

Delete a suggestion by ID

GET

/get/{id}

Get a suggestion by ID

GET

/getAll

Get all suggestions

GET

/match/{id}

Find a match for a user

Project Structure

dating-suggestions-api/
│── src/
│   ├── main/
│   │   ├── java/com/Dating/Suggestions/
│   │   │   ├── controller/
│   │   │   │   ├── UserController.java
│   │   │   ├── service/
│   │   │   │   ├── UserService.java
│   │   │   ├── service/implementation/
│   │   │   │   ├── UserServiceImp.java
│   │   │   ├── repository/
│   │   │   │   ├── repo.java
│   │   │   ├── model/
│   │   │   │   ├── Interest.java
│   │   │   │   ├── Users.java
│   │   │   ├── dto/
│   │   │   │   ├── InterestDto.java
│   │   │   │   ├── UsersDto.java
│   │   │   ├── exceptions/
│   │   │   │   ├── Handler.java
│   │   │   ├── exceptions/interest/
│   │   │   │   ├── MinimumInterest.java
│   │   │   ├── exceptions/user/
│   │   │   │   ├── AgeNotValid.java
│   │   │   │   ├── CorrectDetails.java
│   │   │   │   ├── Missing.java
│   │   │   ├── mapper/
│   │   │   │   ├── Mapper.java
│   │   │   ├── response/
│   │   │   │   ├── Message.java
│   │   │   │   ├── ResponseEnty.java
│   │   │   ├── DatingSuggestionsApplication.java
│   │   ├── resources/
│   │   │   ├── application.properties
│   │   │   ├── data.sql
│   ├── test/java/com/Dating/Suggestions/
│   │   ├── DatingSuggestionsApplicationTests.java
│
│── pom.xml
│── README.md
│── .gitignore
│── mvn
│── mvnw.cmd

