package Exercise_18;

/*
 
 Q3. What are Custom Exceptions,  Exception Chaining, and Logging Exceptions? 
 
 Ans : 
 
 1. Custom Exceptions

Custom exceptions are user-defined exceptions that extend the `Exception` or `RuntimeException` class. 
They allow developers to create specific exceptions tailored to their application's needs.

---

Key Points :
- Extend either `Exception` (checked exception) or `RuntimeException` (unchecked exception).
- Provide meaningful exception names and messages for better debugging.
- Include constructors to pass error messages or causes.

---

Real-life Analogy :
Think of custom exceptions like creating your own warning labels. For example, in a food delivery app, you might create a 
custom exception like `OrderNotFoundException` when a user searches for a non-existent order.

------------------------------------------------------------------------------------------------------------------------------

2. Exception Chaining

Exception chaining allows associating one exception with another, helping developers understand the root cause of an issue by 
linking multiple exceptions.

---

Key Points :
- Achieved using the `Throwable` constructor that accepts a `cause`.
- Helps preserve the original exception while wrapping it in a new exception.

---

Real-life Analogy :
Imagine a user-facing error, like "Payment failed," being caused by an internal error like "Database connection timeout." 
Exception chaining lets you link the two errors for better debugging.

------------------------------------------------------------------------------------------------------------------------------


3. Logging Exceptions

Logging exceptions refers to recording exception details (e.g., messages, stack traces) into logs, enabling developers to 
debug issues without interrupting the user experience.

---

Key Points :
- Use logging frameworks like `java.util.logging`, SLF4J, or Log4j.
- Avoid using `System.out.println()` for exception logging in production.
- Log exception details such as type, message, and stack trace.

---

Real-life Analogy :
In a delivery system, if an error occurs (e.g., address not found), the system logs the issue for later investigation without 
informing the customer about technical details.

 */

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
