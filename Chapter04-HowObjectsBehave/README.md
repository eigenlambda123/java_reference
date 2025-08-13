# Chapter 4: How Objects Behave

This chapter covers how objects interact through methods, how data is passed, and how we protect and manage data inside classes.

---

### Parameters and Arguments

Parameters are variables **declared in the method definition** that act as placeholders for values.
Arguments are the **actual values** passed into a method when it’s called.

Example:

```java
public void greet(String name) { // 'name' is the parameter
    System.out.println("Hello, " + name);
}

greet("Alice");  // "Alice" is the argument
```

Key points:

* Parameters exist only during method execution.
* Arguments must match the type and order of parameters.
* Primitive arguments are **copied** (pass-by-value).
* Object references are **copied**, but the copy still points to the same object in memory.

---

### Return Type

A method’s **return type** defines the type of value it sends back to the caller.

Example:

```java
public int add(int a, int b) {
    return a + b; // returns an int
}
```

Key points:

* Use `void` if no value is returned.
* The returned value’s type must match the method’s declared return type.
* Returning an object reference returns the **address** of that object, not a copy.

---

### Setter and Getter

Setters and getters allow **controlled access** to an object’s private fields.

Example:

```java
public class Car {
    private String model;

    public String getModel() { // Getter
        return model;
    }

    public void setModel(String model) { // Setter
        this.model = model;
    }
}
```

Key points:

* Fields are usually declared `private`.
* Getters return the field’s value.
* Setters assign new values, often with validation.

---

### Encapsulation

Encapsulation is the practice of **hiding data** (making fields `private`) and **providing public methods** for controlled access.

Benefits:

* Protects the object’s internal state.
* Allows validation when setting values.
* Makes the code easier to maintain.

Example:

```java
public class Student {
    private int age;

    public void setAge(int age) {
        if (age > 0) this.age = age;
    }

    public int getAge() {
        return age;
    }
}
```

---

### Instance vs Local Variables

| Feature         | Instance Variable            | Local Variable                  |
| --------------- | ---------------------------- | ------------------------------- |
| Declared in     | Class (outside methods)      | Inside method/constructor/block |
| Scope           | Whole object                 | Method/block only               |
| Default value   | Yes (type-based)             | No (must initialize)            |
| Lifetime        | As long as the object exists | Until method finishes           |
| Memory location | Heap                         | Stack                           |

Example:

```java
public class Example {
    private int instanceVar; // Default 0

    public void test() {
        int localVar; // No default value
        localVar = 10;
        System.out.println(instanceVar); // 0
        System.out.println(localVar);    // 10
    }
}
```
