import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int z = 0;
        int num = sc.nextInt();
        while(num>0){
            z = num % 10;
            sum = sum + z;
            num = num / 10;
        }

        System.out.println(sum);
    }
}
