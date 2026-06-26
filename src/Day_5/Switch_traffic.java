package Day_5;
import java.util.Scanner;
public class Switch_traffic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the colour:");
        String colour = scanner.nextLine();
        switch(colour){
            case "red":{
                System.out.println("Stop");
                break;}
            case "yellow":{
                System.out.println("Ready");
                break;}
            case "green":{
                System.out.println("Go");
                break;}
            default:{
                System.out.println("invalid colour");
            }
        }
        scanner.close();
    }
}
