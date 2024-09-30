// Main.java
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Sound");
    }

    public void action() {
        System.out.println("Action");
    }

    public String getName() {
        return name;
    }
}

class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the lion roars: ROAR!");
    }

    @Override
    public void action() {
        System.out.println(getName() + " the lion is hunting");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Lion("Simba");
        animal1.makeSound(); // 输出: Simba the lion roars: ROAR!
        animal1.action();    // 输出: Simba the lion is hunting
    }
}
