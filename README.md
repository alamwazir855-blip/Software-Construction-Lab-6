
# Lab 06 – Abstract Data Types (ADT)

## Course Information

**Course:** Software Construction and Development  
**Department:** Software Engineering  
**Lab:** 06  
**Student Name:** Alamsher  
**Registration No:** 24ABSWE0010  
**Instructor:** Engr. Rizwan Shah  
**University:** University of Engineering & Technology, Peshawar, Pakistan

---

## Objective

The main purpose of this lab is to understand Abstract Data Types (ADTs) and practice abstraction, encapsulation, interfaces, and separation of specification from implementation in Java.

This lab covers Stack ADT, data encapsulation, programming to abstractions, Library System ADT design, and Student Management System implementation. JUnit 5 is used to test the implemented operations and verify their expected behavior.

## Software and Tools Used

1. Java
2. NetBeans IDE
3. Maven
4. JUnit 5
5. GitHub

---

## Lab Task 1 – Implementing the Stack ADT

### Objective

To understand the Stack Abstract Data Type and its Last In, First Out (LIFO) principle.

### Implementation

The ArrayStack implementation provided in the lab manual was used to implement the Stack ADT.

The push operation inserts elements into the stack, while the pop operation removes and returns the most recently inserted element.

The values 10, 20, and 30 are inserted into the stack. According to the LIFO principle, the pop operation should return 30.

### Testing

The ArrayStackTest.java file is used to test the stack operations.

The test inserts 10, 20, and 30 into the stack and verifies that calling pop() returns 30.

### Result

The test verifies that the Stack ADT follows the LIFO principle and returns the last inserted element.

### Output

(Add screenshot here)

---

## Lab Task 2 – Data Encapsulation

### Objective

To understand data encapsulation and protect internal data by hiding implementation details from the user.

### Implementation

A Student class was implemented in Student.java.

The class contains three private fields:

- id (int)
- name (String)
- cgpa (double)

Public getter methods getId(), getName(), and getCgpa() are provided to access the private data.

This approach prevents direct access to the internal variables and demonstrates encapsulation.

### Testing

The private fields are checked to verify that they cannot be accessed directly from the main method.

Direct access to private variables results in a compilation error.

The public getter methods are used to retrieve the stored student information.

### Result

The task demonstrates that private fields protect internal data, while public getter methods provide controlled access to the information.

### Output

(Add screenshot here)

---

## Lab Task 3 – Programming to an Abstraction

### Objective

To understand how client code can depend on an abstraction rather than a specific implementation.

### Implementation

The abstraction concept is demonstrated in Abstraction.java.

A List interface is used to declare a list variable. The variable is initially assigned an ArrayList implementation, and the student name Ali is added.

The same variable is then reassigned to a LinkedList implementation, and a student is added again.

Both ArrayList and LinkedList implement the List interface.

### Testing

The list is checked with both ArrayList and LinkedList implementations to verify that the same List reference can be used with different implementations.

The task demonstrates that the declared interface does not depend on one specific collection class.

### Result

The task demonstrates that programming to an interface improves flexibility and reduces dependency on a particular implementation.

### Output

(Add screenshot here)

---

## Lab Task 4 – Library System ADT Design

### Objective

To design an Abstract Data Type for a Library System by focusing on what the system does rather than how it performs its operations.

### Implementation

The Library System manages books using the following data:

- Book
- Book ID
- Title
- Author

The LibrarySystem.java file defines the interface for the library system.

The interface specifies the following operations:

- addBook()
- removeBook()
- searchBook()
- issueBook()
- returnBook()

The LibraryImplementation.java file provides the concrete implementation of the LibrarySystem interface using a Java Collection, such as ArrayList or HashMap.

The LibrarySystemMain.java file is used as the main class for demonstrating the library system.

### Testing

The library system operations are checked to verify that books can be added, removed, searched, issued, and returned.

The main class is used to demonstrate the library system functionality.

### Result

The task demonstrates how an interface defines the operations of a library system while the concrete class provides the implementation.

It also demonstrates abstraction and separation of specification from implementation.

### Output

(Add screenshot here)

---

## Lab Task 5 – Student Management System

### Objective

To separate the specification from the implementation for a student collection.

### Implementation

The StudentCollection.java file defines the StudentCollection ADT.

The interface includes the following operations:

- addStudent(Student student)
- removeStudent(int id)
- findStudent(int id)
- getSize()
- isEmpty()

The StudentCollectionImplementation.java file implements the interface and provides the functionality for managing student records.

The StudentDemo.java file is used to demonstrate the student management operations.

### Testing

JUnit tests are written in StudentCollectionTest.java.

The tests verify the following operations:

1. Adding a student to the collection.
2. Removing a student using the student ID.
3. Finding a student by ID.
4. Checking the size of the collection.
5. Checking whether the collection is empty.

### Result

The task demonstrates how an interface defines the required operations of a student collection and how a concrete class implements them.

JUnit testing validates the expected behavior of the student management operations.

### Output

(Add screenshot here)

---

## Project Structure

```text
lab06/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/mycompany/lab6/
│   │           ├── ArrayStack.java
│   │           ├── Student.java
│   │           ├── Abstraction.java
│   │           ├── LibrarySystem.java
│   │           ├── LibraryImplementation.java
│   │           ├── LibrarySystemMain.java
│   │           ├── StudentCollection.java
│   │           ├── StudentCollectionImplementation.java
│   │           └── StudentDemo.java
│   │
│   └── test/
│       └── java/
│           └── com/mycompany/lab6/
│               ├── ArrayStackTest.java
│               └── StudentCollectionTest.java
│
├── pom.xml
└── README.md
```

---

## How to Run the Project

### 1. Clone the Repository

Clone the GitHub repository to your computer.

### 2. Open the Project

Open the project in NetBeans IDE as a Maven project.

### 3. Build the Project

Build the project using Maven to compile the source files.

### 4. Run JUnit Tests

Run the JUnit tests from NetBeans or execute the Maven test command:

```bash
mvn test
```

### 5. Run the Library System

Open LibrarySystemMain.java and run the main class after ensuring that it contains a valid main method.

---

## Conclusion

This lab provided practical experience with Abstract Data Types and important software construction concepts.

The tasks demonstrated the LIFO principle of a Stack ADT, data encapsulation using private fields, programming to abstractions through Java interfaces, Library System ADT design, and Student Management System implementation.

The lab also demonstrated how JUnit testing can be used to verify the expected behavior of methods and operations.

Overall, the lab improved understanding of abstraction, encapsulation, interface-based programming, and maintainable Java application design.

---

## Reflection

During this lab, I learned how Abstract Data Types separate the functionality of a program from its implementation. I practiced using interfaces, encapsulation, and Java Collections to design flexible programs. I also learned how JUnit tests help verify the behavior of different operations. In the future, I would improve the implementation by adding more test cases, handling invalid inputs, and improving the organization of the classes.

---

## Author

**Name:** Alamsher  
**Registration No:** 24ABSWE0010  
**Course:** Software Construction and Development  
**University:** University of Engineering & Technology, Peshawar, Pakistan
