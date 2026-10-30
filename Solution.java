import java.util.Arrays;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0 ;
        int j = 0 ;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {

                i++; 
              
            }
          j++;
        }
          return i;

    }}
// import java.util.Scanner;
// import java.util.Arrays;
// public class assigncookies455 {
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int m = sc.nextInt();
  
//     int g[] = new int[n];
//     for(int i=0 ;i<n ;i++){
//         g[i] = sc.nextInt();
//     }
//     int s[] = new int[m];
//     for(int j=0 ;j<m ;j++){         
//         s[j] = sc.nextInt();
//     }
//     Arrays.sort(g);
//     Arrays.sort(s);
//     int i = 0;
//     int j = 0;
//     while (i < g.length && j < s.length) {
//             if (s[j] >= g[i]) {

//                 i++; 
              
//             }
//           j++;
//         }
//           System.out.println(i);
// }
// }
