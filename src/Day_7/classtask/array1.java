package Day_7.classtask;
import java.util.Arrays;
public class array1 {
    public static void main(String[] args){
        int[] arr = new int[5];
        //arr[0]=10;
        //arr[1]=9;
        //arr[2]=8;
        //arr[3]=7;
       // arr[4]=6;
        //arr[5]=5;
       // arr[6]=4;
       // arr[7]=3;
        //arr[8]=2;
        //arr[9]=1;
        for(int i=0;i<=4;i++){
            arr[i]=((1 + i) * 2 );
        }

        System.out.println("Array: " + Arrays.toString(arr));

    }
}
