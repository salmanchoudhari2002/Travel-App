```markdown
# 🌍 Travel App

Welcome to **Travel App**, a simple yet powerful **Java console-based application** to manage and explore travel destinations!  

Perfect for beginners learning **Java**, **Maven**, and object-oriented programming.

---

## ✨ Features

- ✅ **Add Destinations**: Easily add new travel destinations with country names.
- ✅ **List Destinations**: View all available destinations in a neat list.
- ✅ **Modular Design**: Built with clean **OOP principles** for easy learning and extension.
- ✅ **Unit Testing**: Includes simple JUnit tests to verify functionality.
- ✅ **Maven Project**: Manage dependencies and build easily with Maven.

---

## 🛠️ Technologies Used

- **Java 17**
- **Maven**
- **JUnit 5** for testing

---

## 📂 Project Structure

```
TravelApp/
│
├─ pom.xml
├─ README.md
│
├─ src/
│   ├─ main/
│   │   ├─ java/
│   │   │   └─ com/travelapp/
│   │   │       ├─ App.java
│   │   │       ├─ Destination.java
│   │   │       └─ TravelManager.java
│   │   └─ resources/
│   │       └─ data.txt
│   └─ test/
│       └─ java/
│           └─ com/travelapp/
│               └─ AppTest.java
```

---

## 🚀 How to Run

1. Make sure **Java 17+** and **Maven** are installed.
2. Clone the repo or unzip the project.
3. Open terminal inside project folder.
4. Compile and run:

```bash
mvn compile exec:java -Dexec.mainClass="com.travelapp.App"
```

5. You will see a list of predefined travel destinations printed on the console.

---

## 🧪 Running Tests

Run the included JUnit tests to make sure everything works:

```bash
mvn test
```

---

## 💡 How to Extend

- Add **more attributes** to destinations (like description, rating, or price).  
- Add **user input** to allow dynamic addition of destinations.  
- Implement **search functionality** to filter destinations.  
- Convert to a **GUI-based Java app** for a more interactive experience.

---

## 📖 Learnings

By exploring this project, you'll learn:

- How to structure a **Maven project**.
- Basic **OOP concepts** in Java (classes, objects, lists).
- Writing and running **unit tests**.
- Managing dependencies using **Maven**.

---

## 📜 License

This project is licensed under the **MIT License** – feel free to use and modify it freely!  

---

🌟 **Happy Coding and Happy Traveling!**
```
