package Day_7.classtask;

public class Min {
    public static void main(String[] args){
        int[] arr ={5,7,2,1};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min value is : " + min);
    }
}
