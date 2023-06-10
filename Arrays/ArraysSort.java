import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        //Using the sort method from the built in Arrays class.
        int[] arr = {3,6,2,9,5,8,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(+arr[i]+" ");
        }
    }
}
