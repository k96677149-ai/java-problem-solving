import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if( n % i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("It is prime number");
        }else{
            System.out.println("It is not prime number");
        }
        scanner.close();
    }
}