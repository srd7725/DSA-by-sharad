import java.util.*;
public class MinimumEle{
    public static void main(String args[]){
        int arr[] = {22, 2, 4, 6, 8, 9, 24};

        int min = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i]< min){
                min = arr[i];            }
        }
        System.out.println(min);
    }
}