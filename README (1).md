# Student Management System — Java Software-Engineering-and-Design-Patterns Lab


A simple Java console application demonstrating core Object-Oriented Programming (OOP) concepts through a student management example.

## 📌 Project Overview

This project defines a `Student` class to store student information and a `GraduateStudent` subclass that adds a research topic. It demonstrates how encapsulation and inheritance can help organize and manage data in Java.

## ✨ Features

- Stores each student's ID, name, age, and grade.
- Generates a unique student ID automatically when a new `Student` object is created.
- Uses private fields to demonstrate **encapsulation**.
- Provides getter and setter methods to access and update permitted properties.
- Uses **inheritance** to extend `Student` with the `GraduateStudent` class.
- Stores and updates a graduate student's research topic.
- Displays student information before and after updates.

## 🧠 OOP Concepts Used

### 1. Encapsulation

The fields in `Student` and the `researchTopic` field in `GraduateStudent` are declared `private`. They are accessed or updated through public getter and setter methods. The `studentId` has a getter but no setter, so it cannot be changed directly through the class's public interface.

### 2. Inheritance

`GraduateStudent` extends `Student`, so it inherits the student ID, name, age, and grade functionality. It adds one extra field: `researchTopic`.

### 3. Constructor

The `Student` constructor initializes the student's name, age, and grade and assigns an automatically generated ID. The `GraduateStudent` constructor uses `super(name, age, grade)` to initialize the inherited fields through the parent-class constructor.

### 4. Static Variable and Automatic ID

The static counter `id` is shared by all `Student` objects. Each constructor assigns the current counter value to `studentId` and then increments the counter using `id++`.

## 📁 Project Structure

```text
Student-Management-System/
├── student.java
└── README.md
```

> The source file contains the `Student`, `GraduateStudent`, and `Main` classes. Because `Main` is declared `public`, Java conventionally requires the source file to be named `Main.java`. Rename `student.java` to `Main.java` before compiling with the standard Java compiler.

## ▶️ How to Run

Make sure the Java Development Kit (JDK) is installed.

1. Open a terminal in the project directory.
2. Rename the source file if necessary:

   ```bash
   mv student.java Main.java
   ```

3. Compile the program:

   ```bash
   javac Main.java
   ```

4. Run the program:

   ```bash
   java Main
   ```

## 🧪 Program Workflow

1. Create two `Student` objects and one `GraduateStudent` object.
2. Display their information using getter methods.
3. Update a student's name, age, and grade using setter methods.
4. Update the graduate student's research topic.
5. Display the updated information.

## 💻 Example Output

```text
Student 1
1
Tahmed
23
A

Student 2
2
Rahim
22
B

Graduate Student
3
Karim
25
A
Artificial Intelligence

After Update
Tahmed Ahmed
24
A
Machine Learning
```

*The output assumes the program is run from a fresh start, so the student IDs begin at 1.*

## 🎯 Learning Outcomes

After completing this project, you should understand how to:

- Create classes and objects in Java.
- Protect fields using `private`.
- Access and update data with getters and setters.
- Generate IDs with a static counter.
- Reuse parent-class functionality through inheritance.
- Call a parent constructor using `super()`.

