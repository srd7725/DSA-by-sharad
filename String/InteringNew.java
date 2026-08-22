import java.util.*;
public class InteringNew{
    public static void main(String args[]){
        String s1 = "Sharad";
        // String s2 = new String("Sharad");
        String s2 = "Sharad";
        if(s1 == s2){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}