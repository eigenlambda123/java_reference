## Chapter 1 – Breaking the Surface

### Goal:

To introduce the **basic structure of Java programs**, including classes, the `main()` method, statements, conditionals, and simple loops. This chapter gets your feet wet with Java syntax and how programs run.

---

### Concepts

#### `main()` Method

* Every Java app **starts execution** from a `main()` method:

  ```java
  public static void main(String[] args)
  ```
* It’s the **entry point** of the program.

#### Java Class Structure

```java
public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

* Save this as `MyClass.java` (matches the public class name).
* Compile: `javac MyClass.java`
* Run: `java MyClass`

#### Print to Console

* Use `System.out.println("Text")` to display output.
* `System.out` is a built-in object with a `println()` method.

---

### Basic Building Blocks

#### Statements

* A **statement** is a single command ending in a `;`

  ```java
  int x = 5;
  System.out.println(x);
  ```

#### Loops

* Used to **repeat** actions:

**While loop**

```java
int x = 0;
while (x < 3) {
    System.out.println("x is " + x);
    x++;
}
```

**For loop**

```java
for (int i = 0; i < 3; i++) {
    System.out.println("i is " + i);
}
```

#### Conditionals

* Used to **make decisions** in code:

```java
int x = 5;
if (x > 3) {
    System.out.println("x is greater than 3");
} else {
    System.out.println("x is 3 or less");
}
```

---

### Takeaways

* Java requires everything to be inside a **class**.
* `main()` must be **exactly named and structured** to run.
* The filename must **match the public class name**.
* Java is **case-sensitive**: `Main` ≠ `main`, `String` ≠ `string`.
* Statements end with `;`, and blocks use `{ }`.
