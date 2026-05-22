# 🏨 Hotel Rating System - Microservices Architecture

A scalable and distributed microservices-based application built using Spring Boot and Spring Cloud. This project demonstrates API Gateway routing, Service Discovery, inter-service communication, and multi-database integration using MySQL and MongoDB.

## 🚀 Features

- User Management Service
- Hotel Management Service
- Rating Management Service
- API Gateway for centralized routing
- Eureka Service Discovery
- OpenFeign for inter-service communication
- MySQL database integration
- MongoDB database integration
- RESTful APIs
- Load Balancing
- Distributed Microservices Architecture

---

## 🛠️ Tech Stack

### Backend
- Java 21
- Spring Boot
- Spring Data JPA
- Spring Web
- Spring Cloud Gateway
- Spring Cloud Netflix Eureka
- OpenFeign

### Databases
- MySQL
- MongoDB

### Build Tool
- Maven

### Tools & Platforms
- Git
- GitHub
- Postman
- IntelliJ IDEA

---

## 📦 Microservices

### User Service
Responsible for:
- User CRUD Operations
- Fetching Hotel and Rating details
- Aggregating data from multiple services

### Hotel Service
Responsible for:
- Hotel CRUD Operations
- Hotel Information Management

### Rating Service
Responsible for:
- Rating CRUD Operations
- Hotel Rating Management

### API Gateway
Responsible for:
- Request Routing
- Load Balancing
- Centralized API Access

### Eureka Server
Responsible for:
- Service Registration
- Service Discovery

---

## 🏗️ Project Architecture

```text
                ┌─────────────────┐
                │     Client      │
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │   API Gateway   │
                └────────┬────────┘
                         │
     ┌───────────────────┼───────────────────┐
     ▼                   ▼                   ▼
┌──────────┐      ┌──────────┐      ┌──────────┐
│ User     │      │ Hotel    │      │ Rating   │
│ Service  │      │ Service  │      │ Service  │
└────┬─────┘      └────┬─────┘      └────┬─────┘
     │                 │                 │
     ▼                 ▼                 ▼
 ┌────────┐       ┌────────┐       ┌────────┐
 │ MySQL  │       │ MySQL  │       │MongoDB │
 └────────┘       └────────┘       └────────┘

                ▲
                │
        ┌──────────────┐
        │ Eureka Server│
        └──────────────┘
```

---

## ⚙️ Service Ports

| Service | Port |
|----------|------|
| Eureka Server | 8167 |
| API Gateway | 8085 |
| User Service | 8081 |
| Hotel Service | 8082 |
| Rating Service | 8083 |

---

## 🔄 API Flow

1. Client sends request to API Gateway.
2. Gateway identifies target service.
3. Eureka Server provides service location.
4. Gateway forwards request to target service.
5. Services communicate using OpenFeign.
6. Response is returned to the client.

---

## 📌 Key Concepts Implemented

- Microservices Architecture
- Service Discovery
- API Gateway Routing
- OpenFeign Communication
- Load Balancing
- Distributed Systems
- REST APIs
- Database Integration
- Centralized Routing
- Fault Isolation

---

## 📷 Screenshots

Add screenshots here:
- Eureka Dashboard
- API Gateway Routing
- Postman API Responses
- Database Records

---

## 🚀 Getting Started

### Clone Repository

```bash
git clone https://github.com/your-username/hotel-rating-system-microservices.git
```

### Run Services

1. Start Eureka Server
2. Start User Service
3. Start Hotel Service
4. Start Rating Service
5. Start API Gateway

### Access

```text
Eureka Dashboard:
http://localhost:8167

API Gateway:
http://localhost:8085
```

---

## 👨‍💻 Author

**Suraj Kumar Singh**

- Java Developer
- Spring Boot Developer
- Backend Engineer

LinkedIn:
https://www.linkedin.com/in/suraj-singh-7624a6293/

GitHub:
https://github.com/surajsingh9582

---

## ⭐ If you found this project useful, don't forget to star the repository!