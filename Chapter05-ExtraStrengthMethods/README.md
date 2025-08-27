# Chapter 5: Extra-Strength Methods

This chapter covers planning with **prep code**, validating with **test code**, and implementing **real code**. It introduces the **DotCom game** as a design example, and explores **for loops**, the **enhanced for loop**, and **casting primitives** for more flexible method logic.

---

### Prep Code

* Hybrid of pseudocode and Java.
* Used for planning classes before implementation.
* Focuses on variables, method declarations, and method logic.
* Emphasizes behavior and flow, not compiler rules.

**Example (SimpleDotCom Prep Code):**

```text
DECLARE int array locationCells
DECLARE int numOfHits = 0

METHOD: String checkYourself(String userGuess)
    CONVERT userGuess to int
    REPEAT over locationCells
        IF guess == cell
            INCREMENT numOfHits
            IF numOfHits == 3 RETURN "kill"
            ELSE RETURN "hit"
    RETURN "miss"
END METHOD
```

### Test Code

* Separate class or methods used to verify correctness of real code.
* Typically includes a `main()` method.
* Creates objects, calls methods, and checks outputs.
* Supports incremental development and aligns with XP/TDD practices.

**Example (SimpleDotComTest):**

```java
public class SimpleDotComTest {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        System.out.println(dot.checkYourself("2")); // hit
        System.out.println(dot.checkYourself("3")); // hit
        System.out.println(dot.checkYourself("5")); // miss
    }
}
```

### Real Code

* The final, working implementation.
* Complete, robust, readable, maintainable.
* Transition: **Prep Code → Test Code → Real Code → Refactor**.
* XP principles: simplicity, refactoring, integration, coding standards.

---


### For Loops

* Compact form when iteration count is known.
* Syntax: `for (init; condition; update) { ... }`.
* Loop variable is local to the loop.

**Example:**

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

---

### Enhanced For Loop

* Simplifies traversal of arrays and collections.
* Syntax: `for (type var : collection) { ... }`.
* No index; best for reading, not modifying.

**Example:**

```java
for (String name : names) {
    System.out.println(name);
}
```

---

### Casting Primitives

* **Widening conversions** (int → double): automatic.
* **Narrowing conversions** (double → int): explicit cast, may lose data.
* `char` and `int` interchangeable via Unicode.
* Integer division truncates results.

**Examples:**

```java
int x = 42;
double y = x;         // widening
int z = (int) y;      // narrowing
System.out.println(5/2);    // 2
System.out.println(5/2.0);  // 2.5
```

---

### Loop Comparison

| Feature / Use Case               | while          | for         | enhanced for |
| -------------------------------- | -------------- | ----------- | ------------ |
| Known number of iterations       | works, verbose | best choice | not suitable |
| Traverse array/collection (read) | works          | works       | best choice  |
| Need index or modify elements    | works          | best choice | not suitable |
| Zero or more iterations          | supported      | supported   | supported    |
