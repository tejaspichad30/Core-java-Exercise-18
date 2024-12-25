package Exercise_18;

public class Q2 {

	/*
	 
	 1. throw

- Purpose : Used to explicitly throw an exception from a method or block of code.
- Key Characteristics :
  - Used to generate an exception.
  - Followed by an instance of an exception class (e.g., `throw new Exception();`).
  - Typically used inside a method or block.
  - Can be used to throw both checked and unchecked exceptions.

- Real-life Analogy : Imagine you detect a problem in your homework, and you raise your hand to inform the teacher 
  (throwing the issue to someone else to handle).

- Syntax :
  ```java
  throw new Exception("Error message");
  ```

- Example :
  // java
  public class ThrowExample {
      public static void validateAge(int age) {
          if (age < 18) {
              throw new IllegalArgumentException("Age must be 18 or above.");
          }
          System.out.println("Access granted.");
      }

      public static void main(String[] args) {
          validateAge(16); // This will throw an exception
      }
  }

*/
	//-------------------------------------------------------------------------------------------------------------------
/*


2. throws

- Purpose : Declares exceptions that a method might throw, allowing the caller to handle them.
- Key Characteristics :
  - Used in a method signature to specify which exceptions the method can throw.
  - Alerts the caller that they must handle or further declare the exception.
  - Commonly used for checked exceptions.
  - Multiple exceptions can be declared separated by commas.

- Real-life Analogy : A restaurant menu states, "Contains peanuts, handle if allergic"—it warns you about the potential issue, 
  leaving you to handle it.

- Syntax :
  
  void methodName() throws Exception1, Exception2 { }
  
- Example :
  ```java
  import java.io.*;

  public class ThrowsExample {
      public static void readFile() throws IOException {
          FileReader file = new FileReader("nonexistent.txt");
          BufferedReader reader = new BufferedReader(file);
          System.out.println(reader.readLine());
      }

      public static void main(String[] args) {
          try {
              readFile();
          } catch (IOException e) {
              System.out.println("File not found: " + e.getMessage());
          }
      }
  }

*/
	public static void main(String[] args) {


	}

}
