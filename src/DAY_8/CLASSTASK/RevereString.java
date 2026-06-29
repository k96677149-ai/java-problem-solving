package DAY_8.CLASSTASK;
import java.util.Arrays;
public class RevereString {
    public static void main(String[] args){
        String[] arr ={"veg" ,"non-veg" ,"sweet"};
        String[] arr2 = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[arr.length-1-i];
            }
        System.out.println(Arrays.toString(arr2));
    }
}