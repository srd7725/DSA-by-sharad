import java.util.*;
public class IntIntoStr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "" + n;

        System.out.print(s.length());
    }
}