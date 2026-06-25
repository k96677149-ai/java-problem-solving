package Day_6;

public class nestedfor1 {
    public static void main(String[] args){
        for(int year=1;year<=12;year++){
            for(int month=1;month<=30;month++){
            for(int week=1;week<=4;week++) {
                for (int day = 1; day <= 6; day++) {
                    System.out.println("year " + year + " month " + month + " week " + week + " day " + day);
                    System.out.println("Come to clg,study,go home");
                }

            }
            }
        }
    }
}
