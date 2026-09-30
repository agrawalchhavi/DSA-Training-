import java.util.Scanner;

public class round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int count = 0;
            int place = 1;
            int n = sc.nextInt();
            int temp = n;

            while (temp > 0) {
                int digit = temp % 10;

                if (digit != 0) {
                    count++;
                }

                temp = temp / 10;
                
            }

            System.out.println(count);

            place = 1;

            while (n > 0) {
                int digit = n % 10;

                if (digit != 0) {
                    System.out.print(place * digit + " ");
                }

                n = n / 10;
                place = place * 10;
            }

            System.out.println();
        }

        
    }
}