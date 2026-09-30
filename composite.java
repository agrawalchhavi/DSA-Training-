
public class composite {
    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {

            int count = 0;

            for (int j = 2; j <= n - 1; j++) {

                if (n % j == 0) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(n);
            }
        }
    }
}