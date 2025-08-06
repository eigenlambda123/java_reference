# Chapter 3: Know Your Variables

This chapter focuses on the different types of variables in Java, memory management, and how arrays work with objects.

---

### Primitive Variables

Primitive variables hold simple, low-level data values. These are **not objects** and store their actual value directly in memory.

| Type      | Description      | Example                  |
| --------- | ---------------- | ------------------------ |
| `int`     | Integer numbers  | `int age = 25;`          |
| `double`  | Decimal numbers  | `double pi = 3.14;`      |
| `boolean` | True/False       | `boolean isOpen = true;` |
| `char`    | Single character | `char initial = 'A';`    |

> Avoid assigning a value too large for the chosen primitive type (e.g., don’t assign `100000` to a `byte`). Java doesn't auto-promote without explicit casting.

---

### Object Reference Variables

Unlike primitive types, variables that refer to objects store a **reference (memory address)**, not the actual object. This reference points to an object stored in the **heap**.

Example:

```java
Dog d = new Dog();  // 'd' holds a reference to a Dog object
```

Multiple variables can refer to the **same object**, and changing the object via one reference affects all references pointing to it.

---

### The Heap and Garbage Collection

All objects created using `new` live on the **heap**. The heap is managed by Java’s **Garbage Collector**.

* When no reference points to an object anymore, that object becomes **eligible for garbage collection**.
* Java automatically reclaims memory by clearing out unreferenced objects.

Example:

```java
Dog d = new Dog();
d = null;  // Dog object is now unreachable and can be garbage collected
```

---

### Arrays of Objects (DogArray)

Arrays in Java are also **objects**. When declaring an array of objects:

```java
Dog[] pets = new Dog[3];  // Creates array for 3 Dog references (all null)
```

Each element must be initialized individually:

```java
pets[0] = new Dog();
pets[1] = new Dog();
```

Key points:

* The array holds **references**, not actual Dog objects.
* Each element is initially `null` until explicitly assigned.
* Arrays have a fixed length accessible via `.length`.
