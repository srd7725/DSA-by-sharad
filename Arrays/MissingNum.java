import java.util.*;
public class MissingNum{
    public static void main(String args[]){
        int arr [] = {1, 2, 4, 5, 6, 7, 8, 9};

        int n = arr.length + 1;
        int missing = n;

        for(int i = 0; i< arr.length; i++){
            missing = missing ^ (i+1) ^ arr[i];
        }
        System.out.print(missing);
    }
}