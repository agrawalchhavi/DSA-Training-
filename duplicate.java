import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [5];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                  System.out.println("Duplicate found");
                  return;
            }
             
             }
    }
}
}

//leetcode 
//class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         for (int i = 0; i < nums.length; i++){
//             for (int j = i+1; j < nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
                
//             }
//         }
//     return false;
//      }
// }
