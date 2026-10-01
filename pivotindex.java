import java.util.Scanner;

public class pivotindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int totalsum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            totalsum += nums[i];
        }
        int leftsum = 0;
        int pivot = -1;
        for (int i = 0; i < nums.length; i++) {
            int rightsum = totalsum - leftsum - nums[i];

            if (leftsum == rightsum) {
                pivot = i;
                break;
            }

            leftsum += nums[i];
        }
        System.out.println(pivot);
        sc.close();
    }
}