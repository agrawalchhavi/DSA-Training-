// Given a positive integer N, find the largest digit present in the number.
import java.util.Scanner;
public class largenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > largest) {
                largest = digit;
            }
            n /= 10;
        }
        System.out.println("The largest digit is: " + largest);
        sc.close();
    }
}
