import java.util.Scanner;

public class singlenumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int number = 0;

        for (int i = 0; i < arr.length; i++) {
            number = number ^ arr[i];
        }

        System.out.println(number);
    }
}