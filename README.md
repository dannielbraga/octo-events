# Octo Events
Octo Events is an application that listens to Github Events via webhooks and exposes an api for later use.

### Developed Features - Endpoints

* ` POST /issues`: The Webhook endpoint that receives events from Github and saves them to the database.
* ` GET /issues/{id}/events`: The event endpoint that exposes persistent event filtering by issue id.

### Useful links

* Swagger UI documentation: http://localhost:9090/swagger-ui.html
* H2 Database console: http://localhost:9090/h2-console/

### Tools and technologies used

* RESTful
* Maven
* Java 11
* Spring Boot 2.4.3
* Hibernate
* H2 Database
* Project Lombok
* Swagger 2.9.2
* ModelMapper 2.4.4
