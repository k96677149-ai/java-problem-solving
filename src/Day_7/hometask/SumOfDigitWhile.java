package Day_7.hometask;

import java.util.Scanner;

public class SumOfDigitWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sum of digits: ");
        int n = scanner.nextInt();
        int i=1;
        int sum = 0;
        while(n!=0){
            sum = sum+(n%10);
            n=n/10;
        }
        System.out.println(sum);
    }
}
