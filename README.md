<div align="center">

# 🛒 Commerce Service API

### E-commerce backend system built with Java, Spring Boot & JPA/Hibernate

*REST API • Clean Architecture • Real-world domain model*

<br/>

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-Hibernate-59666C?style=for-the-badge&logo=hibernate)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

<br/>

<img src="https://skillicons.dev/icons?i=java,spring,postgres,maven,git,github" alt="Tech stack icons" />

</div>

<br/>

## 📑 Table of Contents

* [🧭 Overview](#-overview)
* [⚙️ Tech Stack](#️-tech-stack)
* [🏗️ Architecture](#️-architecture)
* [🧠 Practices Adopted](#-practices-adopted)
* [🗄️ Database Configuration](#️-database-configuration-postgresql)
* [📦 Domain Model](#-domain-model)
* [📡 API Endpoints](#-api-endpoints)
* [🚀 How to Run the Project](#-how-to-run-the-project)
* [🧩 Design Decisions](#-design-decisions)
* [📝 Notes](#-notes)
* [✅ Final Result](#-final-result)

<br/>

## 🧭 Overview

> **Commerce Service API** is a RESTful backend application that simulates an e-commerce system.

The project was built following a layered architecture using **Spring Boot, JPA/Hibernate**, and relational databases.

It includes complete **CRUD operations**, **entity relationships**, and **exception handling**, representing a real-world commerce domain with users, orders, products, and payments.

<br/>

## ⚙️ Tech Stack

<div align="left">
<img src="https://skillicons.dev/icons?i=java,spring,postgres" alt="Tech stack" />
</div>

| Technology              | Purpose                    |
| ------------------------ | --------------------------- |
| ☕ **Java 17+**           | Core programming language   |
| 🌱 **Spring Boot**       | Application framework       |
| 🗃️ **Spring Data JPA**   | ORM & data access           |
| 🐘 **PostgreSQL**        | Relational database         |
| 📦 **Maven**             | Dependency management       |

<br/>

## 🏗️ Architecture

The project follows a **layered architecture**:

```
┌──────────────────────────┐
│         Resource          │  → REST Controllers
├──────────────────────────┤
│          Service          │  → Business rules
├──────────────────────────┤
│        Repository         │  → Data access (JPA)
├──────────────────────────┤
│          Entities         │  → Domain model
├──────────────────────────┤
│          Database         │  → PostgreSQL / H2 (test)
└──────────────────────────┘
```

<br/>

## 🧠 Practices Adopted

* ✅ Layered architecture (Resource, Service, Repository)
* ✅ RESTful API design
* ✅ JPA entity mapping and relationships
* ✅ Dependency Injection with Spring
* ✅ Exception handling with custom classes:
  * `ResourceNotFoundException`
  * `DatabaseException`
  * `StandardError`
  * `ResourceExceptionHandler`
* ✅ Test profile with **H2 in-memory database**
* ✅ Data seeding for initial dataset
* ✅ Clean Code principles

<br/>

## 🗄️ Database Configuration (PostgreSQL)

### 🔧 Local configuration (`application-dev.properties`)

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/commerce_db
spring.datasource.username=postgres
spring.datasource.password=123456

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### 🧪 Test profile (H2)

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
```

<br/>

## 📦 Domain Model

The system models a real e-commerce domain:

### Main Entities

* 👤 User
* 📦 Order
* 🧾 OrderItem
* 💳 Payment
* 🛍️ Product
* 🗂️ Category

### Relationships

* User → Order (1:N)
* Order → OrderItem (1:N)
* Product ↔ Category (N:N)
* Order → Payment (1:1)
* OrderItem → Product (N:1)

Includes:

* **Enum:** `OrderStatus` (`WAITING_PAYMENT`, `PAID`, `SHIPPED`, `DELIVERED`, `CANCELED`)
* **Business methods:**
  * `subTotal()`
  * `total()`

<br/>

## 📡 API Endpoints

### 👤 User

| Method | Endpoint      | Description       |
| ------ | ------------- | ------------------ |
| GET    | `/users`      | List all users     |
| GET    | `/users/{id}` | Get user by id     |
| POST   | `/users`      | Create user        |
| PUT    | `/users/{id}` | Update user        |
| DELETE | `/users/{id}` | Delete user        |

<br/>

## 🚀 How to Run the Project

### 1️⃣ Clone the repository

```bash
git clone https://github.com/sarahprando/commerce_service_api.git
```

### 2️⃣ Configure PostgreSQL

Create database:

```sql
CREATE DATABASE commerce_db;
```

### 3️⃣ Run the application

```bash
./mvnw spring-boot:run
```

Or run via IDE.

<br/>

## 🧩 Design Decisions

* 🧱 Spring Boot for rapid backend development
* 🗃️ JPA/Hibernate for ORM and relationships
* 🐘 PostgreSQL for production-ready database
* 🧪 H2 for testing environment
* 🧠 Focus on real-world domain modeling

<br/>

## 📝 Notes

> This project was developed as part of a backend course, focusing on building a complete REST API from scratch using best practices.

It demonstrates:

* Real-world domain modeling
* Clean architecture
* Scalable backend structure

<br/>

## ✅ Final Result

A complete e-commerce REST API, structured, scalable, and ready for future enhancements such as authentication and deployment. 🚀

<br/>

<div align="center">

Made with ☕ and 💻

<img src="https://skillicons.dev/icons?i=java,spring,postgres" />

</div>
