# Chapter 6: Java Library

This chapter introduces **ArrayList** from the Java Collections Framework and demonstrates how to manipulate elements using methods like **add**, **get**, **set**, and **remove**. It also explores other useful methods such as **size**, **isEmpty**, **contains**, and **clear**. Finally, it covers **boolean expressions** with logical operators (`&&`, `||`, `!`, `!=`) and explains how to use the **Java API documentation** as a reference tool.

---

### ArrayList

- A resizable array that grows/shrinks automatically.

- Part of `java.util` package.

- Stores **objects only** (not primitives directly). Use wrapper classes (`Integer`, `Double`, etc.) for primitives.


**Example:**

```java
import java.util.ArrayList;

ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
System.out.println(names); // [Alice, Bob]
```

---

### add and get Methods

- `add(E element)` – appends element to the list.

- `add(int index, E element)` – inserts at a given index.

- `get(int index)` – retrieves element at a specific index.


**Example:**

```java
ArrayList<String> colors = new ArrayList<>();
colors.add("Red");
colors.add("Blue");
System.out.println(colors.get(0)); // Red
```

---

### set Method

- Replaces the element at a specific index.

- Syntax: `set(int index, E element)`.

- Useful for updating values without resizing the list.


**Example:**

```java
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.set(1, "Mango");
System.out.println(fruits); // [Apple, Mango]
```

---

### remove Method

- Removes an element either by **index** or by **object value**.

- `remove(int index)` – removes element at index.

- `remove(Object o)` – removes first occurrence of object.


**Example:**

```java
ArrayList<String> animals = new ArrayList<>();
animals.add("Dog");
animals.add("Cat");
animals.remove("Dog");
System.out.println(animals); // [Cat]
```

---

### Other Useful ArrayList Methods

|Method|Description|Example Output|
|---|---|---|
|`size()`|Returns number of elements|`3`|
|`isEmpty()`|Returns true if list has no elements|`false`|
|`contains(x)`|Checks if list has element `x`|`true`|
|`clear()`|Removes all elements|`[]`|

**Example:**

```java
ArrayList<Integer> nums = new ArrayList<>();
nums.add(10);
nums.add(20);
System.out.println(nums.size());    // 2
System.out.println(nums.contains(10)); // true
nums.clear();
System.out.println(nums.isEmpty()); // true
```

---

### Boolean Expressions with &&, ||, .equals

- `&&` – logical AND, both conditions must be true.
    
- `||` – logical OR, at least one must be true.
    
- `.equals()` – compares **object values**, not references.
    

**Example:**

```java
String a = "Hello";
String b = "Hello";

if (a.equals(b) && a.length() > 3) {
    System.out.println("Match and length > 3");
}
```

---

### ! and != Operators

- `!` – logical NOT, inverts a boolean value.
    
- `!=` – not equal operator (works for primitives).
    

**Example:**

```java
int x = 5;
if (x != 10) {
    System.out.println("x is not 10");
}

boolean flag = false;
if (!flag) {
    System.out.println("Flag is false");
}
```

---

### Using the Java Library (Java API)

- Java API = **Application Programming Interface**.
    
- Official online documentation for all Java classes and methods.
    
- Each class entry shows: constructors, methods, return types, exceptions.
    
- Use it to check **syntax, parameters, return values, and examples**.
    

**Example:**

- Check `ArrayList` API page to learn about `add`, `remove`, `size`, etc.
    
- Prevents guessing and saves time.
