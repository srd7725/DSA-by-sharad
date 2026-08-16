import java.util.*;
public class Binarysrch{

    public static int binarysrch(int arr[], int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {10, 20, 45, 67, 89, 99, 444, 675};

        int target = 99;
        System.out.println(binarysrch(arr, target));
    }
}