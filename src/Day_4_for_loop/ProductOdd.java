package Day_4_for_loop;
import java.util.Scanner;
public class ProductOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int product = 1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                product*=i;
            }
        }
        System.out.println(product);
        scanner.close();
    }
}