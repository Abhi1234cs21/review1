class Animal {
    public void sound(String name, int age) {
        System.out.println("Animal can make sound");
    }
}
class Dog extends Animal {
    public void sound(String name, int age) {
        System.out.println(name + "the dog can bark. Age: " + age);
    }
}
class Cat extends Animal {
    public void sound(String name, int age) {
        System.out.println(name + " the cat can make sound. Age: " + age);
    }
}
public class Overriding {
    public static void main(String[] args) {
        Animal mydog = new Dog();
        Animal mycat = new Cat();
        mydog.sound("Puppy", 2);
        mycat.sound("Miky", 4);
    }
}
