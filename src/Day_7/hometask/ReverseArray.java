package Day_7.hometask;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            //int reverse = 0;
            arr[i] = scanner.nextInt();
        }
        for(int i=size-1;i>=0;i--){
            if(i==size-1) {
                System.out.print("[" + arr[i]);
                continue;
                //System.out.print(arr[i]);
            }
            System.out.print("," + arr[i] );
        }
        System.out.print("]");
    }
}

