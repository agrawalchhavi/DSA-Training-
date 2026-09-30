import java.util.Scanner;
import java.util.Arrays;
public class arraysort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int [n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // for (int i=0; i<arr.length; i++){
        // System.out.println(arr[i]);
        // }

        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
        } 
    }
}

