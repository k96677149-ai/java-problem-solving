package Day_4_for_loop;

public class Add {
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++) {
            System.out.print(i++ + ++i + " ");
        }
    }
}