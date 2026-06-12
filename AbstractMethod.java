// abstract class Trainer{
//     abstract void Question1();
//     abstract void Question2();
// }
// class Student extends Trainer{
//     @Override
//     void Question1(){
//         System.out.println("Answer to question 1");
//     }

//     @Override
//     void Question2(){
//         System.out.println("Answer to question 2");
//     }
// }


// public class AbstractMethod {
//     public static void main(String[] args) {
//         Trainer t = new Student();
//         t.Question1();
//         t.Question2();
//     }
    
// }


// abstract class Animal{
//     String name;
//     Animal(String name){
//         this.name=name;
//     }
//     abstract void makeSound();

// }
// class Dog extends Animal{
//     Dog(String name){
//         super(name);
//     }
//     @Override
//     void makeSound(){
//         System.out.println("The dog "+name+"says woof!");
//     }
// }
// class Cat extends Animal{
//     Cat(String name){
//         super(name);
//     }
//     @Override
//     void makeSound(){
//         System.out.println("The dog "+name+"says meow!");
//     }

// }
// public class AbstractMethod{
//     public static void main(String[] args) {
//         Dog d=new Dog("Buddy");
//         d.makeSound();
//         Cat c=new Cat("Whiskers");
//         d.makeSound();

//     }
// }
   


// import java.util.*;
// interface Animal{
//     void eat();
// }
// interface Mammal inherits Animal{
//     void walk();
// }
// class Human implements Mammal{
    
// }