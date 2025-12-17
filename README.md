# Java Multi-Client Chat Application

## 📌 Project Description

This project is a simple **Java-based multi-client chat application** that works using **socket programming**. It follows a **client–server architecture**, where one server handles multiple clients at the same time. Clients can send messages, and the server broadcasts those messages to all connected clients in real time. The application uses a **GUI (Java Swing)** for user interaction .

---

## 🚀 Features

* One central **server** handling all connections
* Supports **multiple clients simultaneously**
* **Real-time messaging** between users
* **Broadcast messaging** (messages sent to all clients)
* Simple and user-friendly **GUI interface**
* Uses **TCP sockets** for reliable communication
* Handles client connections using **multithreading**

---

## 🛠 Technologies Used

* Java (JDK 17)
* Java Socket Programming
* Java Swing (GUI)
* Multithreading
* Git & GitHub

---

## 📂 Project Structure

```
chatapp/
 ├── Server.java
 ├── ClientGUI.java
```

---

## ▶️ How to Run the Project

### 1️⃣ Run the Server

* Open the project in VS Code
* Run `Server.java`
* The server will start on port **5000**

### 2️⃣ Run the Client

* Run `ClientGUI.java`
* Enter a username when prompted
* Open multiple client windows to test multi-client chatting

⚠️ Make sure the server is running **before** starting any client.

---

## 🧠 How It Works (Brief Explanation)

* The **Server** listens on a specific port and accepts incoming client connections.
* Each client is handled using a separate **thread**.
* Messages received from one client are **broadcast** to all other connected clients.
* The **Client GUI** allows users to type and view messages in real time.

---

## 🎓 Academic Purpose

This project was developed as part of a **Java networking assignment** to demonstrate:

* Socket programming concepts
* Client–server communication
* Multithreading in Java
* Basic GUI development

---

## 👤 Author

**Yididya Solomon**
GitHub: [https://github.com/yidu77](https://github.com/yidu77)

---

## 📜 License

This project is for **educational purposes** only.
