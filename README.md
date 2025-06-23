
# Employee API Server

This is a custom API server built using **Spring Boot** that manages employee records. It demonstrates a complete CRUD (Create, Read, Update, Delete) system using RESTful endpoints and a connected database.

## ✅ Features

- Custom REST API with 5 endpoints
- Backend with Java + Spring Boot + Spring Data JPA
- Integrated with relational database (configurable via `application.properties`)
- Uses standard layered architecture: Controller, Service, Repository, Entity

---

## 📁 Project Structure

```
public-apis-connection/
│
├── pom.xml                          # Maven configuration
└── src/
    └── main/
        ├── java/com/example/employeeapi/
        │   ├── EmployeeApiApplication.java       # Main application class
        │   ├── model/Employee.java               # JPA entity
        │   ├── repository/EmployeeRepository.java# Data access layer
        │   └── controller/EmployeeController.java# API endpoints
        └── resources/
            └── application.properties            # Database and Spring config
```

---

## 🚀 API Endpoints

| Method | Endpoint               | Description                |
|--------|------------------------|----------------------------|
| GET    | `/api/employees`       | Fetch all employees        |
| GET    | `/api/employees/{id}`  | Fetch employee by ID       |
| POST   | `/api/employees`       | Create new employee        |
| PUT    | `/api/employees/{id}`  | Update existing employee   |
| DELETE | `/api/employees/{id}`  | Delete employee by ID      |

### 🧪 Example POST Request

```
POST /api/employees
Content-Type: application/json

{
  "name": "Alice",
  "email": "alice@example.com",
  "department": "Engineering"
}
```

---

## 🧰 Technology Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL** (or H2 for testing)
- **Maven**

---

## 🔧 How to Run

1. **Clone the repository**

```bash
git clone https://github.com/Awadhesh-Gupta/public-apis-connection.git
cd public-apis-collection
```

2. **Configure your database** in `src/main/resources/application.properties`

For MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:8970/employeesdb
spring.datasource.username=EmployeeDb
spring.datasource.password=Awadhesh9844#
spring.jpa.hibernate.ddl-auto=update
```

Or use H2 in-memory database:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
```

3. **Run the server**

```bash
./mvnw spring-boot:run
```

Server will start on `http://localhost:8970`

---

## 🧪 Testing the API

You can test using `curl` or Postman.

```bash
curl -X GET http://localhost:8970/api/employees
```

---

## 📄 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

Built with ❤️ by [Awadhesh Gupta Kaulapuri]
