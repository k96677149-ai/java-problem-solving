package Day_7.classtask;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i <=4; i++){
            if(i % 2 != 0) {
                sum = sum + arr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);

    }
}