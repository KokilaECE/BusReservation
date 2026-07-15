# 🚌 Bus Reservation System

A **Java Bus Reservation System** built using **Java, JDBC, and MySQL**. The application allows users to register, log in, view available buses, check seat capacity and AC availability, and book bus tickets through a simple console-based interface.

---

## ✨ Features

- 👤 User Registration
- 🔐 User Login
- 🚌 View Available Buses
- 💺 Check Available Seat Capacity
- ❄️ View AC / Non-AC Bus Availability
- 🎫 Book Bus Tickets
- 📋 View Booking Details
- 💾 MySQL Database Integration using JDBC
- ⚡ Real-time Seat Availability Updates

---

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- Eclipse IDE / IntelliJ IDEA
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

```
BusReservationSystem/
│── src/
│   ├── Main.java
│   ├── Bus.java
│   ├── Booking.java
│   ├── BusDAO.java
│   ├── BookingDAO.java
│   └── DBConnection.java
│
├── database/
│   └── busreservation.sql
│
├── README.md
└── .gitignore
```

---

## 🗄️ Database

The project uses **MySQL** to store:

- User Details
- Bus Information
- Seat Capacity
- AC Availability
- Booking Details

---

## 🚀 How to Run

1. Clone the repository.

```bash
git clone https://github.com/kokilaece/BusReservationSystem.git
```

2. Open the project in Eclipse or IntelliJ IDEA.

3. Create the MySQL database.

```sql
CREATE DATABASE busreservation;
```

4. Import the SQL tables.

5. Update your database credentials in `DBConnection.java`.

```java
String url = "jdbc:mysql://localhost:3306/busreservation";
String username = "root";
String password = "your_password";
```

6. Add the MySQL JDBC Driver.

7. Run `Main.java`.

---

## 📋 Application Menu

```
========== BUS RESERVATION SYSTEM ==========

1. User Registration
2. User Login
3. View Available Buses
4. Check Seat Capacity
5. View AC / Non-AC Availability
6. Book Ticket
7. Exit

===========================================
```

---

## 📚 Concepts Used

- Java OOP
- JDBC Connectivity
- MySQL Database
- CRUD Operations
- Exception Handling
- Classes & Objects
- Database Management

---

## 🚀 Future Enhancements

- Ticket Cancellation
- Booking History
- Admin Panel
- Online Payment Gateway
- Email Ticket Confirmation
- GUI using Java Swing or JavaFX
- Spring Boot REST API

---

## 👩‍💻 Author

**Kokila V**

Java Developer

---

## 📄 License

This project is developed for learning and educational purposes.
