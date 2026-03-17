*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjquestion2notes;

/**
 *
 * @author keaga
 */
public class PrjQuestion2Notes {

    public static void main(String[] args) {
        
        //calss and objects
        // A class is a "blueprint" for objects
class Car {
    // ---- Properties / Attributes (fields, variables inside a class)
    String brand;   // e.g., BMW, Toyota
    int speed;      // how fast the car goes

    // ---- Constructor (special method called when making an object)
    Car(String brand, int speed) {
        this.brand = brand;   // "this" refers to the current object's brand
        this.speed = speed;   // assign speed to the object's speed
    }

    // ---- Method (behavior / action of the object)
    void drive() {
        System.out.println(brand + " driving at " + speed + " km/h");
    }
}

// ---- Usage
Car c = new Car("BMW", 120); // make a Car object (brand=BMW, speed=120)
c.drive();                   // call its method → BMW driving at 120 km/h



//Encapsulation 

// Encapsulation = hiding data (make fields private) and
// controlling access with getters & setters.
class BankAccount {
    private double balance;  // private → cannot access directly outside this class

    // Constructor sets up account
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Getter (read-only access)
    public double getBalance() {
        return balance;
    }

    // Setter-like method (write access with rules)
    public void deposit(double amt) {
        if (amt > 0) {       // safety check
            balance += amt;
        }
    }
}

// ---- Usage
BankAccount acc = new BankAccount(100);
acc.deposit(50);  
System.out.println(acc.getBalance()); // prints 150

//Abstracrtions

// Abstract class = cannot be directly used with 'new'.
// It may contain abstract methods (no body) that must be implemented by subclasses.
abstract class Animal {
    abstract void sound();  // no body → subclass must define it
}

// Subclass (concrete class)
class Dog extends Animal {
    // Must implement sound() since parent said it's abstract
    void sound() {
        System.out.println("Woof!");
    }
}

// ---- Usage
Animal a = new Dog();  // polymorphism: reference is Animal, object is Dog
a.sound();             // prints "Woof!"



//Interface

// Interface = 100% abstract contract (all methods must be implemented)
interface iRecipes {
    void PrintRecipes(); // method signature only, no body
}

// A class implements the interface → must provide method body
class Recipe implements iRecipes {
    public void PrintRecipes() {
        System.out.println("Printing recipe...");
    }
}

// ---- Usage
iRecipes r = new Recipe();
r.PrintRecipes(); // prints "Printing recipe..."



//Inhertiance
// Parent (superclass)
class Parent {
    void greet() {
        System.out.println("Hello from parent");
    }
}

// Child (subclass) inherits Parent
class Child extends Parent {
    void greetChild() {
        System.out.println("Hi from child");
    }
}

// ---- Usage
Child c = new Child();
c.greet();      // inherited method → Hello from parent
c.greetChild(); // child method → Hi from child




//Polymorphism

// Overloading = same method name, different parameter types
class MathOps {
    int add(int a, int b) { return a + b; }           // version 1
    double add(double a, double b) { return a + b; }  // version 2
}

// Overriding = child replaces parent method
class Animal {
    void sound() { System.out.println("Generic sound"); }
}
class Cat extends Animal {
    @Override
    void sound() { System.out.println("Meow"); }  // overrides parent
}

// ---- Usage
Animal a = new Cat(); // reference is Animal, object is Cat
a.sound();            // prints "Meow" (not "Generic sound")

    }
}
