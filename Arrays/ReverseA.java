import java.util.*;
public class ReverseA{
    public static void main(String args[]){
        int arr [] = {22, 34, 56, 23, 4, 8, 9,66, 45, 543};
        int n = arr.length;
        int i = 2;
        int j = 7;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}