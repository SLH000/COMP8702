## Class Definitions, Logical Operators, Selection and Iteration Statements

### Aims and Objectives

This laboratory has been designed to help you to

- design and modify class definitions,
- extend a class with additional methods and instance variables and
- make use of selection and iteration statements.

### Task 1

The following class definitions are included:

```java
public class FrogProgram {
    public static void main(String[] args) {
        Frog myFrog = new Frog();  // creates a Frog object
        myFrog.name = "Fred";    // ###
        myFrog.print();
    }
}

public class Frog {
    String name = "Name not set";
    int id = -1;   // -1 used to indicate it has not been set

    public Frog {
        // Constructor currently does nothing
        // not code in the body of the constructor
    }

    public void print() {
        System.out.println("**** Start of print method ****");
        System.out.println("Frogs name is " + name);
        System.out.println("Id is " + id);
    }
}
```

Compile and run the application. It should produce the output:  <br><br>
__<tt>**** Start of print method ****  
Frog’s name is Fred  
Id is -1</tt>__

Add an assignment statement to the **main** method which sets the instance variable `id`, contained in the object
referred to by `myFrog`, to 1000.   
**Hint**: observe how the instance variable name is being assigned a value in the line ending with // ###.

Compile and run the application. It should produce the output:   <br><br>
__<tt>**** Start of print method ****  
Frog’s name is Fred  
Id is 1000  </tt>__

Modify the program in the following ways.

1. Declare another instance variable in the class `Frog` to store a Frog’s age in days. Its initial value should be 0.
2. Add code to the **main** method to assign the instance variable `age`, in the object referred to in my `myFrog`, to
   22
3. Define a method called `printAgeGroup` which has no formal parameters and which prints out the age group of the frog
   according to the following table:

   | Age               | Age Group          |
         |:-------------------|:------------------|
   | 0 to 20 days      | young              |
   | 21 to 50 days     | juvenile           |
   | more than 50 days | adult              |

4. Add a (call) to the `printAgeGroup` method (in the object referred to by `myFrog`) to the end of the **main** method.
5. Run the application from IntelliJ . The following output should be produced:  <br><br>
   __<tt>**** Start of print method ****  
   Frog’s name is Fred  
   Id is 1000  
   Age group is juvenile</tt>__

--- 

### Checkpoint 22

Have the program source code and output marked by a demonstrator

---

### Task 2

Modify the program developed in Task 1 in the following ways.

1. Prefix each of the instance variable declarations (`name`, `id` and `age`) with the reserved word
   **private**. Not any errors and be prepared to determine what caused them.
2. Remove the offending assignment statements from the **main** method.
3. Modify the constructor in the class `Frog` so that it has three formal parameters, `theName`,
   `theId` and `theAge`, and assigns the corresponding instance variables, `name`, `id` and `age` to the formal
   parameters.
4. Add a declaration and statements to the end of the **main** method to create another `Frog`
   with the `name` _Fran_, and `id` of _1001_ and an `age` of _75_. The variable `myFrog2` should be used to store a
   reference to the new frog. Include calls to `print` and `printAgeGroup` for this frog.
5. Run the application from IntelliJ . The following output should be produced:  <br><br>
   __<tt>**** Start of print method ****  
   Frog’s name is Fred  
   Id is 1000  
   Age group is juvenile  
   **** Start of print method ****  
   Frog’s name is Fran  
   Id is 1001  
   Age group is adult</tt>__  <br><br>

6. Add accessor methods for the `name` and `age` in the `Frog` class

---

### Checkpoint 23

Have the program source code and output marked by a demonstrator

---

### Task 3

Modify the program developed in Task 2 in the following ways.

1. Add a definition of a method called `reversedName` to the class `Frog` which **_prints_** the name using the
   following translation table:   
   (_You only have to print the name **_not change any letters_** in the name_)

   | Letter | Letter _printed_ in its place |
   |--------|-------------------------------|
   | a      | i                             |
   | n      | i                             |
   | r      | o                             |
   | F      | o                             |

Make use of a _for loop_ and a _switch statement_ to control the printing of letters.

2. At the end of the **main** method add calls to the `reverseName` method for both frogs and a call to print the `name`
   of each frog using the accessor methods created in Task 2
3. Run the application from IntelliJ . The following output should be produced:  
   __<tt>**** Start of print method ****  
   Frog’s name is Fred  
   Id is 1000  
   Age group is juvenile  
   **** Start of print method ****  
   Frog’s name is Fran  
   Id is 1001  
   Age group is adult  
   ooed  
   ooii    
   Frog’s name is Fred  
   Frog’s name is Fran  
   </tt>__

---

### Checkpoint 24

Have the program source code and output marked by a demonstrator

---

### Task 4
Modify the program developed in Task 4 in the following ways.
1. Add a definition of a method called `greaterAge` to the class `Frog` which takes another `Frog`
   as a formal parameter and returns the `frog` (object reference) with the greatest age. For
   example,
   ```java
   Frog f = myFrog.greaterAge(myFrog2);
   f.print();
   ```
   should cause the following lines to be printed: <br><br> 
   __<tt>**** Start of print method ****  
   Frog’s name is Fran  
   Id is 1001</tt>__  
2. Add the above statements to the end of the **main** method.

---   
### Checkpoint 25
Have the program source code and output marked by a demonstrator

---