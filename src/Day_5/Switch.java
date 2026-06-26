package Day_5;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day = scanner.nextInt();
        switch(day){
            case 1:{
                System.out.println("sunday");
                break;
            }
            case 2:{
                System.out.println("monday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("thursday");
                break;
            }
            case 5:{
                System.out.println("friday");
                break;
            }
            case 6:{
                System.out.println("saturday");
                break;
            }
            case 7:{
                System.out.println("invalid day");
                break;
            }
        }
        scanner.close();
    }
}