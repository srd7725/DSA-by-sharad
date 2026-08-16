import java.util.*;
abstract class stud{
    abstract void count();
}

class Girl extends stud{
    void count(){
        System.out.println("there is 100 firls");
    }
}

public class Main3{
    public static void main(String args[]){
        Girl g = new Girl();
        g.count();
    }
}