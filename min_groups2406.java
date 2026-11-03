import java.util.Arrays;
class Solution {
    public int min_groups2406(int[][] intervals) {
        int n= intervals.length;
        int [] s = new int[n];
        int [] e = new int[n];
        for(int i=0; i<n ; i++){
            s[i] = intervals[i][0];
            e[i]= intervals[i][1];
        }
        Arrays.sort(s);
        Arrays.sort(e);
        int i =0, j=0, group =0 , max_group=0;
        while(i<s.length){
            if(s[i] <= e[j] ){
                group ++ ;
                max_group = Math.max(group , max_group);
                i++ ;
            }
            else{
                group --;
                j++;
            }
        }

        return max_group;
    }
}