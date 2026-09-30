//no of prime digits and composite no. in the given number 
import java.util.Scanner;

public class primecomposite_count {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int primecount = 0;
        int compositecount = 0;

        int num = sc.nextInt();

        while (num > 0) {

            int digit = num % 10;

            if (digit >= 2) {

                int count = 0;

                for (int i = 1; i <= digit; i++) {
                    if (digit % i == 0) {
                        count++;
                    }
                }

                if (count == 2) {
                    primecount++;
                } else {
                    compositecount++;
                }
            }

            num = num / 10;
        }

        System.out.println("Prime digits: " + primecount);
        System.out.println("Composite digits: " + compositecount);
    }
}