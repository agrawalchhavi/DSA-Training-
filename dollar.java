// A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first banana, 2k dollars for the second one and so on (in other words, he has to pay i·k dollars for the i-th banana).

// He has n dollars. How many dollars does he have to borrow from his friend soldier to buy w bananas?
import java.util.Scanner;
public class dollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int totalCost = k * (w * (w + 1)) / 2;
        int amountToBorrow = totalCost - n;
        if (amountToBorrow < 0) {
            amountToBorrow = 0;
        }
        System.out.println(amountToBorrow);
        sc.close();
    }
}