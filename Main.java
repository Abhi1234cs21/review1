class Animal{
public void eat(){
System.out.println("animal can eat");
}
}
class Dog extends Animal{
public void sleep(){
System.out.println("Dogs can sleep");
}
}
class Cat extends Animal{
public void sound(){
System.out.println(" cat can make sound");
}
}
public class Main{
public static void main(String[] args){
Dog mydog=new Dog();
Cat mycat=new Cat();
mydog.eat();
mydog.sleep();
mycat.eat();
mycat.sound();
}
}