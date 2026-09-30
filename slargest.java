// find the2nd largest element 
import java.util.Arrays;
import java.util.Scanner;
public class slargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr =  {10,80,40,20,39};
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
             slargest = largest;
             largest = arr[i];

            }
            else if(arr[i] > slargest && arr[i]!= largest)
            slargest = arr[i];
        
        }}
    }

    
    
