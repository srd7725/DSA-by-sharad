// Inharitance in java

import java.util.*;
class Inharitance{
    void sound(){
        System.out.println("Aimal make sound");
    }
}
class Dog extends Inharitance{
    void bark(){
        System.out.println("Dog barks");
    }
}

public class Main{
    public static void main(String args[]){
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}