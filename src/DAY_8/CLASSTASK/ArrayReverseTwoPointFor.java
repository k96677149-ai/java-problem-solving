package DAY_8.CLASSTASK;
import java.util.Arrays;
public class ArrayReverseTwoPointFor {
    public static void main(String[] args){
        int[] num = {1,2,3,4};
        int left = 0;
        int right = num.length-1;
        int temp;
        for(int i=1;i<=num.length/2;i++){
            temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(num));
    }
}
