# Jackson - Student Profile Manager

This project is built as part of the **Crio.Do Product Engineer Round 2 Assignment**.  
It demonstrates how to use the **Jackson library in Java** for serializing and deserializing objects, handling JSON field mismatches, and working with real-world use cases.

---

## Project Structure

```
jackson-student-profile/
├── student.json            # Sample input file
├── Student.java            # POJO with Jackson annotations
├── Main.java               # Demo code for serialization/deserialization
├── README.md               # You're here!
```

---

## Concepts Demonstrated

- Serialization of Java objects to JSON
- Deserialization of JSON into Java objects
- Using `@JsonProperty` to handle mismatched JSON keys
- Parsing nested structures (e.g., List<String>)
- Real-world theme: **Student Profile Manager**

---

##  Prerequisites

You’ll need:
- Java 8+
- Jackson JAR files:
  - [`jackson-core`](https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.15.2/jackson-core-2.15.2.jar)
  - [`jackson-databind`](https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.15.2/jackson-databind-2.15.2.jar)
  - [`jackson-annotations`](https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.15.2/jackson-annotations-2.15.2.jar)                                                                
Place the JARs in the project root or use a `lib/` folder.

---

## How to Compile & Run

### 1. If you're on Windows:
```bash
javac -cp ".;jackson-core-2.15.2.jar;jackson-databind-2.15.2.jar" Main.java
java -cp ".;jackson-core-2.15.2.jar;jackson-databind-2.15.2.jar" Main
```

### 2. If you're on Mac/Linux:
```bash
javac -cp ".:jackson-core-2.15.2.jar:jackson-databind-2.15.2.jar" Main.java
java -cp ".:jackson-core-2.15.2.jar:jackson-databind-2.15.2.jar" Main
```

---

## Sample Output

```
Name: Ravi  
Subjects: [Math, Physics]  
First Name: Neha  
GPA: 8.5
```

---

