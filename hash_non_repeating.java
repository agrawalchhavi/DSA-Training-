import java.util.Scanner;
import java.util.HashMap;
public class hash_non_repeating {
    public static void main(String[] args){
        HashMap<Integer, Integer> h1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int [n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<arr.length; i++){
            h1.put(arr[i], h1.getOrDefault(arr[i], 0) + 1);
        }
        for (int i=0; i<arr.length; i++){
            if (h1.get(arr[i]) == 1) {
                System.out.println(arr[i]);
            }
            else {
                System.out.println("0");
            }
        }
        
    }
}
