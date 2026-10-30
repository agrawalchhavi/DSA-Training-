
import java.util.Scanner;
import java.util.HashMap;

public class boy_girl236A {
    public static void main(String[] args) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int count = 0;

        String s = sc.next();
        char arr[] = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            h1.put(arr[i], h1.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (h1.get(arr[i]) == 1) {
                count++;
            }
        }

        count = h1.size();

        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
