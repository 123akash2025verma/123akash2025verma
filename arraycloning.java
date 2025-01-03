 import java.util.Arrays;
 public class arraycloning {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int brr[]=Arrays.copyOf(arr,arr.length); 
        for(int i=0; i<brr.length; i++){
            System.out.print(brr[i]+" ");
        }
    }
}
