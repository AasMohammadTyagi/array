package Assignment;
import java.util.*;
public class FindDuplicate {
//    0 7 2 5 4 7 1 3 6
    public static int duplicateNumber(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        int array[]={0,7,2,5,4,7,1,3,6};
        int n= array.length;
        System.out.println(duplicateNumber(array));

    }
}

