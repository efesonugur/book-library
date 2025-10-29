# Book Library API

A simple **CRUD REST API** built with **Spring Boot, Hibernate (JPA), Flyway, H2, and embedded Tomcat**.   

## Features

- Create, read, update, and delete (CRUD) book entries  
- RESTful API with JSON responses  
- Persistence via **Spring Data JPA** with Hibernate  
- Database migrations using **Flyway**  
- In-memory database using **H2** (optional: file-based mode)  
- Runs on **embedded Tomcat** (no external server required)  
- Input validation and structured error handling  

## Tech Stack

- **Java 17**  
- **Spring Boot 3**  
- **Spring Data JPA (Hibernate)**  
- **Flyway**  
- **H2 Database**  
- **Maven**  

## Project Structure

```
book-library-api/
├─ src/main/java/com/efesonugur/library
│ ├─ BookLibraryApplication.java         # Main entry point
│ ├─ model/Book.java                     # Entity definition
│ ├─ repository/BookRepository.java
│ ├─ service/BookService.java
│ └─ controller/BookController.java
├─ src/main/resources
│ ├─ application.properties
│ └─ db/migration/V1__init.sql           # Flyway migration
├─ pom.xml
└─ README.md
```

## Getting Started

### Prerequisites

- Java 17+  
- Maven  

### Run the application

```bash
./mvnw spring-boot:run
```

App starts at: `http://localhost:8080`

## API Endpoints

### Create a Book

```bash
curl -X POST http://localhost:8080/api/books \
  -H "Content-Type: application/json" \
  -d '{"title":"Clean Code","author":"Robert C. Martin","isbn":"9780132350884","publishedYear":2008}'
```

### Get Book by ID

```bash
curl http://localhost:8080/api/books/1
```

### List All Books

```bash
curl http://localhost:8080/api/books
```

### Update Book

```bash
curl -X PUT http://localhost:8080/api/books/1 \
  -H "Content-Type: application/json" \
  -d '{"title":"Clean Coder","author":"Robert C. Martin","isbn":"9780137081073","publishedYear":2011}'
```

### Delete Book

```bash
curl -X DELETE http://localhost:8080/api/books/1
```

## Future Improvements

- Add pagination & sorting
- Implement PATCH for partial updates
- Expose health checks with Spring Boot Actuator
- Integration tests with MockMvc