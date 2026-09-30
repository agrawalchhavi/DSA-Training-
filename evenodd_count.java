import java.util.Scanner;
public class evenodd_count {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int evencount = 0;
    int oddcount = 0;
    do{
        int rem = num % 10;
        if(rem%2==0){
            evencount++;}
        else{
            oddcount++;}

        num = num/10;
    }while(num>0);
    System.out.println(evencount);
    System.out.println(oddcount);

    }
}
