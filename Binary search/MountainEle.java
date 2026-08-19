import java.util.*;

public class MountainEle {

    static int peakIndexInMountainArray(int[] arr) {

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] < arr[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }

    public static void main(String[] args) {

        int[] arr = {0, 2, 5, 3, 1};

        int ans = peakIndexInMountainArray(arr);

        System.out.println("Peak Index = " + ans);
        System.out.println("Peak Element = " + arr[ans]);
    }
}