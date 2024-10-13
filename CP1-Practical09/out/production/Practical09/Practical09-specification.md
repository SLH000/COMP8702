## Inheritance

### Aims and Objectives

The aim of the practical is to provide a basis for experimentation with basic forms of inheritance

On successful completion of the practical you will have the ability to construct Java classes which extend/modify the
behaviour of existing classes by overriding (redefining) existing methods or including new methods.

### Task 1

1. Complete the definition of the class `Vehicle` by adding

    1. instance variables to store the `capacity` (of type <var>int</var>) and `make` (of type <var>String</var>)
    2. a constructor with the following header:
       ```java
       public Vehicle(int capacity, String make)
       ```
       and which assigns the respective instance variables.
    3. a void method `print()` that outputs the information as shown below in the example output.

2. Complete the definition of the class `Car` by adding

    1. instance variables to store the `type` and `model` (both <var>Strings</var>) of the car
    2. a constructor with the following header:
       ```java
       public Car(int capacity, String make, String type, String model)
       ```
       and which assigns the respective instance variables. **Note**, the first statement in the constructor should be a
       call to the constructor of the super class (`Vehicle`):
       ```java
       super( ...
       ```

Once you have completed the above you can run the program from the class `Task` and the following output should be
produced:  
**<tt>Vehicle Info:  
&ensp; capacity = 1200cc  
&ensp; make = Holden  
Vehicle Info:  
&ensp; capacity = 1500cc  
&ensp; make = Mazda</tt>**

**Note** that the class `Car` does not have a `print` method and thus the `type` and `model` are not printed. This will
be added as part of the next task.
---

### Checkpoint 42

Have the program source code and output marked by a demonstrator

---

### Task 2

1. Modify the class `Car` to include a `print` method which invokes its parent’s `print` method
   (by making use of `super`) and prints out the `type` and `model`.  
   The following output should be produced when the program is run:
   **<tt>Vehicle Info:  
   &ensp; capacity = 1200cc  
   &ensp; make = Holden   
   &ensp; type = sedan   
   &ensp; model = Barina  
   Vehicle Info:  
   &ensp; capacity = 1500cc  
   &ensp; make = Mazda  
   &ensp; type = sedan     
   &ensp; model = 323</tt>**

---

### Checkpoint 43

Have the program source code and output marked by a demonstrator

---

### Task 3

1. Modify the class `Vehicle`, the base class, to include a method called `setCapacity` which allows the engine capacity
   to be changed (see example below).
    1. Modify the class `Car` so that it _overrides_ the method `setCapacity` with its own version which output the
       message "_Cannot change capacity of a car_" and does not change the engine capacity.  
       Modify the class `Task` to be:

```java
public class Task {
    public static void main(String[] args) {
        Car car1 = new Car(1200, "Holden", "sedan", "Barina");
        Vehicle v1 = new Vehicle(1500, "Mazda");
        v1.setCapacity(1600);
        v1.print();
        car1.setCapacity(1600);
        car1.print();
    }
}
```  

The following output should be produced when the program is run:  <br><br>
**<tt>New capacity = 1600  
Vehicle Info:  
&ensp; capacity = 1600cc  
&ensp; make = Mazda  
Cannot change capacity of a car  
Vehicle Info:  
&ensp; capacity = 1200cc  
&ensp; make = Holden  
&ensp; type = sedan  
&ensp; model = Barina</tt>**
---

### Checkpoint 44

Have the program source code and output marked by a demonstrator

---

### Task 4

1. Add a class called `VehicleDB` which can store up to 100 `Vehicle` objects. It should include the following methods:
    1. a method called `addVehicle` which adds a `Vehicle`, or any of its descendants, to the database (see example
       below).
    2. a method called `print` which prints all the `Vehicles` in the database (see example below). **Hint**: make use
       of
       each `Vehicle`’s `print` method.
2. Modify the class Task to be:

```java
   public class Task {
    public static void main(String[] args) {
        VehicleDB db = new VehicleDB();
        db.addVehicle(new Car(1200, "Holden", "sedan", "Barina"));
        db.addVehicle(new Vehicle(1500, "Mazda"));
        db.print();
    }
}
   ```

The following output should be produced when the program is run:  <br><br>
**<tt>=== Vehicle Data Base ===  
Vehicle Info:  
&ensp; capacity = 1200cc  
&ensp; make = Holden  
&ensp; type = sedan  
&ensp; model = Barina  
Vehicle Info:  
&ensp; capacity = 1500cc  
&ensp; make = Mazda </tt>**

3. Add a class called `HoldenDB` which inherits from (extends) `VehicleDB`. It should include:
    1. a constructor which has no formal parameters and which calls its parent’s constructor with an actual parameter of
       <br>50.
    2. a method called `addCar` which takes three parameters (see example below), creates a
       `Car` object and adds it to the database by making use one of its parent’s methods.
4. Modify the class Task to be:

```java
   public class Task {
    public static void main(String[] args) {
        HoldenDB db = new HoldenDB();
        db.addCar(1200, "sedan", "Barina");
        db.addCar(3800, "wagon", "Commodore");
        db.print();
    }
}
```

The following output should be produced when the program is run:  <br><br>
**<tt>=== Vehicle Data Base ===  
Vehicle Info:  
&ensp; capacity = 1200cc  
&ensp; make = Holden  
&ensp; type = sedan  
&ensp; model = Barina  
Vehicle Info:  
&ensp; capacity = 3800cc  
&ensp; make = Holden  
&ensp; type = wagon  
&ensp; model = Commodore</tt>**
---

### Checkpoint 45

Have the program source code and output marked by a demonstrator

---