import java.util.Scanner;
public class banana {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int totalMoney = 0;
        for (int i=1;i<=w;i++){
            totalMoney += k*i;
        }   
        if (totalMoney > n) {
            System.out.println(totalMoney - n);
        } else {
            System.out.println(0);
        }

    }
}

