public class Java_Encapsulation {
    public static void main(String[] args) {
        Person person = new Person("wyz", 23);

        // getter
        System.out.println("Name" + person.getName());
        System.out.println("Age" + person.getAge());

        // setter
        person.setAge(30);
        System.out.println("Age changed to " + person.getAge());

        // test error handling
        person.setAge(-30);
    }
}

// 运行方法：确保有Person.java和Java_Encapsulation.java两个文件
// 然后先:javac Person.java Java_Encapsulation.java 编译两个文件
// 再：java Java_Encapsulation 运行包含 main 方法的类