import java.util.*;
public class SecondLarge{
    public static void main(String args[]){
        int arr[] = {22, 34, 56, 44, 4 ,9 ,51, 34};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
           
        }
        System.out.println(max);
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > smax && arr[i] != max){
                smax = arr[i];
            }
        }
         if(smax == Integer.MIN_VALUE){
            System.out.print("there is no second largest element");
         }
         else{
            System.out.print(smax);
         }
        

    }
}