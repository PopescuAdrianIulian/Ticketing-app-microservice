# 🎟️ Ticketing Microservice Application  

A ticketing application built with a microservice architecture, allowing users to book tickets for events at various venues.
---

## 🏗️ Architecture Overview  

This application consists of multiple **Spring Boot microservices**, each handling a specific responsibility:

- **🛡️ API Gateway**: Routes requests, manages security (Keycloak), and consolidates API documentation  
- **🏢 Inventory Service**: Manages venues, event availability, and ticket inventory  
- **📅 Booking Service**: Processes ticket reservations and communicates with inventory  
- **📦 Order Service**: Handles order processing and updates inventory  

---

## 🚀 Tech Stack  

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)  
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)  
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)  
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)  
![Apache Kafka](https://img.shields.io/badge/Apache%20Kafka-231F20?style=for-the-badge&logo=apache-kafka&logoColor=white)  
![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)  

- **Spring Boot**: Backend framework for microservices  
- **Kafka**: Asynchronous communication between services  
- **MySQL**: Data persistence  
- **Docker**: Containerization for scalable deployment  
- **Keycloak**: Authentication & Authorization  
- **Resilience4j**: Fault tolerance with circuit breaking  
- **Swagger/OpenAPI**: API documentation  

---

---

## 🛠️ Service Details  

### 🔹 API Gateway  
✔ Routes requests to appropriate services  
✔ Implements **Keycloak-based security**  
✔ Uses **Resilience4j** for circuit breaking  
✔ Consolidates **Swagger API docs**  

### 🔹 Inventory Service  
✔ Manages **venues & events**  
✔ Handles **ticket availability** updates  
✔ Provides REST endpoints for querying venues/events  

### 🔹 Booking Service  
✔ Validates **ticket reservations**  
✔ Checks **inventory availability**  
✔ Publishes booking events to **Kafka**  

### 🔹 Order Service  
✔ Listens for **Kafka booking events**  
✔ Processes **order confirmations**  
✔ Updates ticket inventory after successful bookings  

---

## 🔄 Communication Flow  

1️⃣ **User submits a booking request** via **API Gateway**  
2️⃣ **API Gateway** forwards the request to **Booking Service**  
3️⃣ **Booking Service** validates availability via **Inventory Service**  
4️⃣ If available, **Booking Service** publishes an event to **Kafka**  
5️⃣ **Order Service** processes the order and updates inventory  

---

## 🔒 Security & Fault Tolerance  

- ✅ **🔑 Keycloak**: Secure authentication with JWT & role-based access control  
- ✅ **⚡ Resilience4j**: Circuit breakers & fallback mechanisms  
- ✅ **🛤️ Kafka**: Asynchronous messaging for handling failures gracefully  

---

## ▶️ Running the Application  

### ✅ Prerequisites  
- Docker & Docker Compose  
- Java 17+  
- Maven  

### Setup
1. Clone the repository
2. Navigate to the project root
3. Run the infrastructure services:
   
bash
   cd inventoryservice
   docker-compose up -d

### Setup
1. Clone the repository
2. Navigate to the project root
3. Run the infrastructure services:
   ```bash
   cd inventoryservice
   docker-compose up -d
   ```
4. Build and run each service:


### Access Points
- API Gateway: http://localhost:8090
- Keycloak: http://localhost:8091
- Swagger UI: http://localhost:8090/swagger-ui.html
- Kafka UI: http://localhost:8084
