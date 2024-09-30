public class Person {
    private String name;
    private int age;

    // public construction method
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // difference between getter and setter: Getter can get value and Setter can
    // modify value.

    // public getter method
    public String getName() {
        return name;
    }

    // public setter method
    public void setName(String name) {
        this.name = name;
    }

    // public getter method
    public int getAge() {
        return age;
    }

    // public setter method
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("invalid age");
        }
    }
}

// 运行方法：确保有Person.java和Java_Encapsulation.java两个文件
// 然后先:javac Person.java Java_Encapsulation.java 编译两个文件
// 再：java Java_Encapsulation 运行包含 main 方法的类
