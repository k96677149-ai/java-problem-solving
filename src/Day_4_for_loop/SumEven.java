package Day_4_for_loop;
import java.util.Scanner;
public class SumEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}