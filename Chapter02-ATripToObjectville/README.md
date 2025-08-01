## Chapter 2 – A Trip to Objectville

### Goal:

To introduce **object-oriented programming (OOP)** by creating and using objects in Java. Start thinking in terms of **objects, classes, fields, and methods** instead of just logic and flow.

---

### Concepts

#### Objects & Classes

* A **class** is a blueprint. An **object** is a real instance of that blueprint.

* Example:

  ```java
  class Dog {
      int size;
      String name;

      void bark() {
          System.out.println("Woof! Woof!");
      }
  }
  ```

* Create an object using:

  ```java
  Dog myDog = new Dog();
  myDog.size = 40;
  myDog.name = "Rex";
  myDog.bark();
  ```

---

### Object Anatomy

| Component            | Description                                                 |
| -------------------- | ----------------------------------------------------------- |
| **Fields**           | Store the object’s state (data) → `int size`, `String name` |
| **Methods**          | Define behavior → `void bark()`                             |
| **new**              | Creates an object instance → `new Dog()`                    |
| **dot operator `.`** | Access fields/methods → `myDog.bark()`                      |

---

### Using Multiple Objects

Creating many instances from one class:

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

* **Encapsulation**: Data (fields) and behavior (methods) are bundled inside objects.
* **Reusability**: Define a class once and reuse it as many times as needed.
* **Responsibility**: Objects handle their own tasks. For example, the `Player` object guesses, the `Game` object runs the game.

---

### Common Mistake Alert

* If the class is `public`, the filename **must match** the class name:

  ```java
  // File must be named MovieTestDrive.java
  public class MovieTestDrive { ... }
  ```

---

### Java Project Structure

* **Keep one public class per file.**
* Compile each `.java` file separately if needed.
* Then run the class with the `main()` method.

