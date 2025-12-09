# 🔐 Simple Console Login System

A basic Java console application that simulates a user authentication system. It prompts the user for a username and password and verifies them against hardcoded credentials using conditional logic.

## 📝 Description

This project demonstrates the fundamentals of:
* Handling user input with `java.util.Scanner`.
* String comparison in Java using the `.equals()` method.
* Basic `if-else` control flow for authentication success or failure.

## 🔑 Default Credentials

To successfully log in, you must use the following credentials defined in the code:

| Type | Value |
| :--- | :--- |
| **Username** | `Fikret` |
| **Password** | `123` |

## 🚀 How to Run

1.  **Compile** the Java file:
    ```bash
    javac Login.java
    ```

2.  **Run** the application:
    *(Note: Ensure you are in the directory containing the package folder or remove the `package aa;` line if running simply)*
    ```bash
    java aa.Login
    ```

## 💻 Usage Example

**Successful Login:**
```text
Kullanıcı adı giriniz
Fikret
Parolanızı giriniz:
123
Başarılı bir şekilde giriş yaptınız
