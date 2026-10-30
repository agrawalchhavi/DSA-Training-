import java.util.*;
public class majorityelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int [n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            h1.put(arr[i],h1.getOrDefault(arr[i], 0) + 1);
        }
        for (int i=0; i<arr.length; i++){
            if (h1.get(arr[i]) > n/2) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
