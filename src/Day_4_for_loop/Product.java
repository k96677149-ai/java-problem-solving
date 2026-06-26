package Day_4_for_loop;
import java.util.Scanner;
public class Product {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int product = 1;
        System.out.print("Enter the number:");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                product*=i;
            }
        }
        System.out.println(product);
    }
}