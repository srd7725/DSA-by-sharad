import java.util.*;
public class MaximumEle{
    public static void main(String args[]){
        int arr[] = {22, 2, 4, 6, 8, 9, 24};

        int max = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}