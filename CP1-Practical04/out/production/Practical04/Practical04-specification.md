## A Complete Application with Objects

### Aims and Objectives

This laboratory has been designed to help you

- learn how to define classes which are instantiated in the main method of an application;
- gain further practice with defining methods which are only used within a class (object) and those which are intended
  to be invoked using an object reference.

### Task 1

On completion of this task you will have demonstrated the ability to construct

- a simple class definition containing instance variables and methods, and
- a class containing only a main method which creates an instance of a class (an object) and accesses instance
  variables, and invokes methods, through a reference to the object. In IntelliJ add the following to the
  files `BoatMaker.java` (the Java main class) and `Boat.java` (the Java class file):

1. **Boat** – this class contains:
    1. an instance variable, `regNum`, of type `int` initialised to **-1**
    2. an instance variable, `bClass`, of type `String` initialised to "**unknown**"
    3. an instance variable `name` of type `String` which is initialised to "**unknown**"
    4. a method `print` which does not return a value (i.e. the return type is `void`), has no formal parameters and
       prints the boat’s _name_, _class_ and _registration number_. in the following format:<br><br>

       Boat _name_, Class = _bClass_, Registration # = KA _regNum_  <br><br>
   where the words in italics should be replaced with the values of the corresponding instance variables.
   
2. **BoatMaker** – this class contains a main method which performs the following actions:
    1. Prints the message “_Starting boat application_”
    2. Defines a variable called `myBoat` of type `Boat` and which is initialised to a new `Boat` object.
    3. Invokes (calls) the `print` method from `myBoat`
   
Compile and run the application from IntelliJ . The following output should be produced:  <br><br>
   <tt>Starting boat application  
   Boat unknown, Class = unknown, Registration # = KA -1  
   </tt>

---

### Checkpoint 17

Have the program source code and output marked by a demonstrator

---

### Task 2

Modify the program developed in Task 1 as directed below.

1. Extend the definition of the class `Boat` to include a _constructor_ with the following formal parameters:
    1. `the_name` of type `String`
    2. `the_bClass` of type `String`
    3. `the_regNum` of type `int`   
       The constructor should assign each of the class’s instance variables to the respective formal parameter. For
       example, `regNum` should be assigned to the value of `the_regNum`. For example,  <br><br>
       **<tt>new Boat("Harmony Blue","International 505",6467);</tt> <br><br>**
       constructs a new Boat object.  
       **Note that**

    - constructors do not have a return type and
    - defining your own constructor, effectively undefines the default constructor (`Boat()`).
2. Extend the definition of the class Boat to include a default constructor, namely,  
   **<tt>Boat() {}</tt>**
3. Modify the **main** method in the definition of the class `BoatMaker` to perform only the following:
    1. Print the message “_Starting boat application_”
    2. Define a variable called `myBoat1` of type `Boat` and initialise it to a new Boat object using the _**default
       constructor**_ (as in Task 1).
    3. Define a variable called `myBoat2` of type `Boat` and initialise it to a new Boat object constructed with the
       actual parameters "_Harmony Blue_", "_International 505_" and _6467_
    4. Invoke (call) the `print` method from `myBoat1`
    5. Invoke (call) the `print` method from `myBoat2`
4. Run the application from IntelliJ . The following output should be produced:  
   **<tt>Starting boat application  
   Boat unknown, Class = unknown, Registration # = KA -1  
   Boat Harmony Blue, Class = International 505, Registration # = KA 6467  </tt>**

---

### Checkpoint 18

Have the program source code and output marked by a demonstrator

---

### Task 4

Modify the program developed in Task 2 as directed below.

1. The class Boat should be extended/modified to include the following:
    1. a **constant** called `yardstick` with a value of 95.0 (ensure the correct formatting of the variable name),
    2. ensure all instance variables are private,
    3. a **method** called `setName` which sets the instance variable `name` to a value which is passed as a parameter,
    4. a **method** called `getName` which _returns_ the value of the instance variable `name`.
2. Add statements to the end of the **main** method to do the following:
    1. Change the name of `myBoat1` to "_Australia II_" (invoke the setName method in the object referred to
       by `myBoat1`).
    2. Invoke (call) the `print` method from `myBoat1`.
    3. Print the names of `myBoat1` and `myBoat2` (invoke the `getName` method in both of the objects referred to
       by `myBoat1` and `myBoat2` and print out the results).
3. Run the application from IntelliJ . The following output should be produced:  
   **<tt>Starting boat application  
   Boat unknown, Class = unknown, Registration # = KA -1  
   Boat Harmony Blue, Class = International 505, Registration # = KA 6467  
   Boat Australia II, Class = unknown, Registration # = KA -1  
   Australia II  
   Harmony Blue  
   </tt>**

---

### Checkpoint 19

Have the program source code and output marked by a demonstrator

---

### Task 4

Modify the program developed in Task 3 as directed below.

1. The class `Boat` should be extended/modified to include the following:  
   1. a count of the total number of `Boat` objects created. This should be incremented by 1 each time a `Boat` is
   created.  
   2. a _**static** method_ called `printTotal` which outputs the total number of boats created. For example,  
   **<tt>Total number of boats created = 4</tt>**  
   3. the sequence number (incremented by 1 each time) of each boat should be stored and output with the other boat
   information as part of the `Boat` class’s `print` method. For example,  
   **<tt>Boat Harmony Blue, Class = International 505, Registration # = KA 6467  
   Sequence number = 3</tt>**  
   4. the **non-default** constructor should be extended to include a formal parameter, `previousBoat`, of type `Boat`,
   the value of which should be stored in the newly created `Boat` object, by means of an _instance variable_ of
   type `Boat`.
2. The **main** method should:  
   1. Print the message “_Starting boat application_”  
   2. Invoke the `printTotal` method.  
   3. Define a variable called `boat1` initialised to a `Boat` object constructed with the name
   "**B1**", the class "**C**", the registration number **1000** and a boat (the forth argument to the constructor)
   of **null** (a special value meaning no object).  
   4. Define a variable called `boat2` initialised to a `Boat` object constructed with the name
   "**B2**", the class "**C**", the registration number **1001** and a boat of **boat1**.  
   5. Similarly define instance variables `boat3` and `boat4` so that each is constructed with a reference to the
   previous one.  
   6. Make use of a **while loop** which starts with `boat4`, invokes its `print` method and then does the same for the
   boat stored by its constructor (`previousBoat`) and so on until all boats have been printed. The code **must not**
   refer to the variables `boat1`, `boat2` or `boat3`.  
   7. Invoke the `printTotal` method.
3. Run the application from IntelliJ. The following output should be produced:  
   **<tt>Starting boat application  
   Total number of boats created = 0  
   Boat B4, Class = C, Registration # = KA 1003  
   Sequence number = 4  
   Boat B3, Class = C, Registration # = KA 1002  
   Sequence number = 3  
   Boat B2, Class = C, Registration # = KA 1001  
   Sequence number = 2  
   Boat B1, Class = C, Registration # = KA 1000  
   Sequence number = 1  
   Total number of boats created = 4</tt>**

---

### Checkpoint 20

Have the program source code and output marked by a demonstrator

---
