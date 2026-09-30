import java.util.Scanner;
public class dowhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        do {
             int rem = n%10 ;
             if (rem==7){
                count ++;
             }
             n = n/10 ;
            
        } while (n > 0);
        System.out.println(count);
    }
    
}


