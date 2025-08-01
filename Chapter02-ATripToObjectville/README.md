## Chapter 2 – A Trip to Objectville

### Objective

To introduce foundational object-oriented programming (OOP) concepts in Java, including **classes, objects, methods, and instance variables**. This chapter focuses on shifting from procedural thinking to object-based design.

---

### Concepts

#### Classes and Objects

* A **class** defines a blueprint for objects. It encapsulates data (instance variables) and behavior (methods).
* An **object** is an instance of a class, created using the `new` keyword.

Example:

```java
class Dog {
    int size;
    String name;

    void bark() {
        System.out.println("Woof!");
    }
}
```

Instantiation and usage:

```java
Dog myDog = new Dog();
myDog.size = 40;
myDog.name = "Rex";
myDog.bark();
```

---

### Instance Variables and Methods

* **Instance variables** (e.g., `int size`, `String name`) store the state of an object. Each object maintains its own copy.
* **Methods** (e.g., `bark()`) define the behavior of the object.
* Methods can access the instance variables of the object they belong to.

---

### Using Multiple Instances

Multiple objects can be created from a single class definition. Each object maintains its own state:

```java
Movie one = new Movie();
one.title = "Inception";
one.genre = "Sci-fi";
one.rating = 9;

Movie two = new Movie();
two.title = "Jaws";
two.genre = "Horror";
two.rating = 8;

two.playIt();
```

---

### Object-Oriented Thinking

* **Encapsulation**: Fields and behaviors are grouped within a class, providing modular and self-contained components.
* **Responsibility**: Each object is responsible for its own behavior (e.g., a `Player` object performs its own guessing).
* **Interaction**: Objects collaborate by sending messages (method calls) to each other.

---


### Common Mistake Alert

* If the class is `public`, the filename **must match** the class name:

  ```java
  // File must be named MovieTestDrive.java
  public class MovieTestDrive { ... }
  ```

---

### Java Syntax and Structure

* When a class is declared `public`, the filename must match the class name.

  ```java
  public class MovieTestDrive { ... }
  // → File must be named MovieTestDrive.java
  ```
* Each `.java` file typically contains one public class.

