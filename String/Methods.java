import java.util.*;
public class Methods{
    public static void main(String args[]){
        String s = "Ri shika";
        System.out.println(s.contains("ishika"));
        if(s.contains("shika")){
            System.out.println("happy");
            System.out.println(s.startsWith("rishi"));
            System.out.println(s.startsWith("Ri"));
            System.out.println(s.endsWith("shika"));


        }
    }
}