import java.util.Arrays;
import java.util.Scanner;

public class Sol1{
    public static void main(String[] args) {
        //storing 1-8 in array and printing
        int [] arr = new int[8];
        for (int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        //printing
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }

        //take inputs in 2D martrix and print the elements
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter number of rows: ");
        int a = input.nextInt();
        System.out.println("Enter number of columns : ");
        int b = input.nextInt();
         int [][] arr2= new int[a][b];
        
         for (int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.println("Enter numbers ");
                arr2[i][j]=input.nextInt();
            }
         }

         //printing
         for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
         }

    }
}
