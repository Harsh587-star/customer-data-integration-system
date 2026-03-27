# 🚀 Customer Data Integration System

A Java-based backend application built using Spring Boot that simulates real-world **Salesforce CRM** and **MuleSoft integration** concepts. This project demonstrates how customer data can be managed, processed, and synchronized across systems using REST APIs and an integration layer.

---

## 📌 Project Overview

This project is designed to replicate enterprise-level data flow where:

* Customer data is created and managed via APIs
* Data is transferred using **RESTful services**
* An integration layer simulates **MuleSoft-style data synchronization**
* JSON is used for communication between systems

---

## 🧠 Key Features

* ✅ CRUD operations for customer management
* ✅ REST API implementation using HTTP methods (GET, POST, PUT, DELETE)
* ✅ Integration layer simulating MuleSoft data flow
* ✅ JSON-based request and response handling
* ✅ Scalable architecture using layered design
* ✅ API testing support via Postman

---

## 🛠️ Tech Stack

| Category    | Technology          |
| ----------- | ------------------- |
| Backend     | Java, Spring Boot   |
| API         | REST (HTTP Methods) |
| Data Format | JSON                |
| Database    | H2 (In-Memory)      |
| Build Tool  | Maven               |
| Testing     | Postman             |

---

## 🏗️ Project Structure

```
customer-data-integration-system/
│
├── controller/
├── service/
├── repository/
├── model/
├── integration/   # MuleSoft Simulation Layer
├── resources/
└── DemoApplication.java
```

---

## ⚙️ How to Run the Project

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/customer-data-integration-system.git
cd customer-data-integration-system
```

### 2️⃣ Run the Application

```bash
mvn spring-boot:run
```

---

## 🌐 API Endpoints

### ➤ Add Customer

```
POST /customers
```

### ➤ Get All Customers

```
GET /customers
```

### ➤ Sync Customer Data (Integration Layer)

```
POST /customers/sync
```

---

## 📥 Sample JSON Input

```json
{
  "name": "Harsh",
  "email": "harsh@gmail.com"
}
```

---

## 🔄 MuleSoft Simulation

The project includes an **Integration Service Layer** that mimics MuleSoft functionality by:

* Handling data transfer between services
* Simulating external system communication
* Processing API-based data flow

---

## 🎯 Learning Outcomes

* Practical understanding of REST API development
* Hands-on experience with Java Spring Boot architecture
* Exposure to integration concepts used in MuleSoft
* Understanding of CRM-style data handling (like Salesforce)
* Improved backend design and modular coding practices

---

## 📌 Future Enhancements

* 🔹 MySQL database integration
* 🔹 Authentication & Authorization
* 🔹 Swagger API documentation
* 🔹 Deployment on cloud platforms

---

## 👨‍💻 Author

**Harsh Raj**
📧 [harsh934raj@gmail.com](mailto:harsh934raj@gmail.com)
🔗 [LinkedIn](https://linkedin.com/in/harsh-raj-27ba75300)
💻 [GitHub](https://github.com/Harsh587-star)

---

## ⭐ If you found this useful, give it a star!

---
