import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num = sc.nextInt();
        for ( int i=2 ; i <= num-1 ; i++){
            if ( num %  i == 0 ){
                count ++ ; }
        }
        if (count == 0){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
        System.out.println(count);
    }}