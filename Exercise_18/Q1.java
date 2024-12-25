package Exercise_18;


/*
 Q1.  Differentiate Finally vs Final vs Finalize?
 
 ans: 
 
1. finally:  

A block in exception handling that always executes.

Purpose : Used to execute cleanup code (like closing resources) regardless of whether an 
          exception occurred or not.

- Key Characteristics:
  - Always executes after `try` and `catch` blocks.
  - Ensures that resources like files or database connections are properly closed.

- Real-life Example : Imagine you borrowed a library book. Whether you finish reading it or not, you always return it to 
  the library. Returning the book is like the `finally` block.


 */
//------------------------------------------------------------------------------------------------------------------------------
//- Example:
  
  
//	public class Q1 {
//      public static void main(String[] args) {
//          try {
//              int result = 10 / 0; // This will throw an exception
//          } catch (ArithmeticException e) {
//              System.out.println("Caught exception: " + e.getMessage());
//          } finally {
//              System.out.println("Finally block executed.");
//          }
//      }
//	}
//
//

//  Output:
//  
//  Caught exception: / by zero
//  Finally block executed.
//-------------------------------------------------------------------------------------------------------------------------------

/*
---------------------------------------------------------------------------------------------------------------------------------
2. final :
  
A keyword used to define constants, prevent inheritance, or prevent method overriding.

- Purpose :
  1. Final Variables : Make a variable constant (its value cannot be changed after initialization).
  2. Final Methods : Prevent method overriding.
  3. Final Classes : Prevent inheritance of a class.

- Key Characteristics :
  - Used for creating immutable entities (e.g., constants).
  - Guarantees that certain behaviors cannot be modified by subclasses or other methods.

- Real-life Analogy : A national constitution is considered "final"; it cannot be casually changed by anyone.

- Examples :
  1. Final Variable :
     // java
     public class FinalVariableExample {
         public static void main(String[] args) {
             final int MAX_VALUE = 100; // Constant
             System.out.println("Max Value: " + MAX_VALUE);
             // MAX_VALUE = 200; // Compilation Error
         }
     }
 ------------------------------------------------------------------------------------------------------------------------------
 */

/*
-------------------------------------------------------------------------------------------------------------------------------

3. finalize :  
A method called by the garbage collector before an object is destroyed.

- Purpose : Used to perform cleanup operations before an object is garbage collected.
- Key Characteristics :
  - Declared as `protected` in the `Object` class.
  - Rarely used in modern Java because alternatives like `try-with-resources` are preferred.

- Real-life Analogy : Before demolishing a building, workers might ensure all utilities are disconnected. This is   
  similar to the `finalize()` method cleaning up resources before an object is destroyed.

- Example :
  ```java
  public class FinalizeExample {
      @Override
      protected void finalize() throws Throwable {
          System.out.println("Object is being garbage collected.");
      }

      public static void main(String[] args) {
          FinalizeExample obj = new FinalizeExample();
          obj = null; // Make object eligible for garbage collection
          System.gc(); // Request garbage collection
      }
  }


Output :
  
  Object is being garbage collected.



 */

