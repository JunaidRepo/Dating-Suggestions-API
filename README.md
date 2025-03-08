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




API Endpoints

POST   /add   Add a new dating suggestion

POST  /addAll  Add multiple suggestions

PUT   /update   Update an existing entry

DELETE  /delete/{id}   Delete a suggestion by ID

GET  /get/{id}   Get a suggestion by ID

GET   /getAll  Get all suggestions

GET  /match/{id}   Find a match for a user
