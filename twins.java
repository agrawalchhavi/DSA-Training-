import java.util.Scanner;

public class twins {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] coins = new int[n];
        for(int i=0;i<n;i++){
            coins[i] = sc.nextInt();
            sum += coins[i];
        }
        int mySum = 0;
        int count = 0;
        for(int i=n-1;i>=0;i--){
            mySum += coins[i];
            count++;
            if(mySum > sum - mySum){
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
    
} 