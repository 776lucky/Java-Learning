// Abstract class Animal
abstract class Animal { // abstract
    abstract void sound(); // Abstract method
}

// Dog class inherits Animal
class Dog extends Animal {
    void sound() {
        System.out.println("Woof"); // Dog's implementation of the sound method
    }
}

// Cat class inherits Animal
class Cat extends Animal {
    void sound() {
        System.out.println("MiaoMiao");
    }
}

// Main class
public class Java_Abstract {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Create a Dog object, assign it to Animal reference
        Animal myCat = new Cat(); // Create a Cat object

        myDog.sound(); // Output: Woof
        myCat.sound(); // Output: MiaoMiao
    }
}
