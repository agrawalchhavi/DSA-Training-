import java.util.Scanner;

public class Raising_Bacteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int count = 0;

        while (x > 0) {
            count += x % 2;
            x = x / 2;
        }

        System.out.println(count);

        sc.close();
    }
}
