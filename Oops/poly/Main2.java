// //Overloading

// import java.util.*;
// class Animal{
//     int add(int a, int b){
//         return a+b;
//     }
// }
// class Dog extends Animal{
//     int add(int a, int b, int c, int d){
//         return a*b*c*d;
//     }
// }

// public class Main2{
//     public static void main(String args[]){
//         Dog d = new Dog();
//         System.out.println(d.add(3,5));
//         System.out.println(d.add(4,5,6,7));
//     }
// }


class play{
    void fun(){
        System.out.println("child play to fun");
    }
}

class Boy extends play{
    @Override
    void fun(){
        System.out.println("boy are shy");
    }
}

public class Main2{
    public static void main(String args[]){
        Boy b = new Boy();
        b.fun();
    }
}