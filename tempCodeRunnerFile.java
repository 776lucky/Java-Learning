// JAVA多模态
// Java multimodal
class Animal {
    // 动物的名字，protected 允许子类直接访问
    protected String name;

    // 构造函数：初始化动物的名字
    public Animal(String name) {
        this.name = name;
    }

    // 发出声音的方法，将被子类重写
    public void makeSound() {
        System.out.println("Sound");
    }

    // 动物的行为方法，将被子类重写
    public void action() {
        System.out.println("Action");
    }

    // 获取动物名字的方法
    public String getName() {
        return name;
    }
}

// Lion 类：继承自 Animal 类
class Lion extends Animal {
    public Lion(String name) {
        super(name);  // 使用传入的 name
    }

    // 重写 makeSound 方法，实现狮子特有的叫声
    @Override
    public void makeSound() {
        System.out.println(getName() + " the lion roars: ROAR!");
    }

    // 重写 action 方法，实现狮子特有的行为
    @Override
    public void action() {
        System.out.println(getName() + " the lion is hunting");
    }
}

// 使用示例
public class Main {  // 类名首字母大写
    public static void main(String[] args) {  // main 方法首字母小写
        // 创建一个 Lion 对象，但使用 Animal 引用类型（多态）
        Animal animal1 = new Lion("Simba");  // 创建 Lion 对象时传入名字
        
        // 调用方法：会执行 Lion 类中重写的版本
        animal1.makeSound(); // 输出: Simba the lion roars: ROAR!
        animal1.action();    // 输出: Simba the lion is hunting
    }
}
