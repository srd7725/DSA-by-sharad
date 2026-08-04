import java.util.*;
public class Create{
    public static void main(String args[]){
        // int arr[] = {34, 3, 4, 3, 2, 4, 23};

        // System.out.println(arr.length);
        // for(int i = 0; i< arr.length-1; i++){
        //     System.out.print(arr[i] + " ");
        // }
        Scanner sc = new Scanner(System.in);
        int[] srd = new int[7];

        for(int i = 0; i< 7; i++){
            srd[i] = sc.nextInt();
        }
        for(int i = 0; i < 7; i++){
            System.out.print(2*srd[i] + " ");
        }

    }
}