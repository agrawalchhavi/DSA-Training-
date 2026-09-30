// Rohan enters a positive integer N. Count how many digits in the number are equal to 7.
import java.util.Scanner;
public class passwordchecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        do {
            if (n % 10 == 7) {
                count++;
            }
            n /= 10;
        } while (n > 0);
        System.out.println("Number of 7s in the password: " + count);
        sc.close();
    
    }
}