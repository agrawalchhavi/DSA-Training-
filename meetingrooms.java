import java.util.*;
public class meetingrooms {
    
}class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        Arrays.sort(start);
        Arrays.sort(end);
        int i =0, j=0, room = 0, max_room =0;
        while(i<start.length){
            if(start[i]<end [j]){    
                room ++;
                max_room =Math.max(max_room ,room);
                i ++;
            }
            else{
                room --;
                j++;
        
            }
            
        }
        return max_room;
        
    }
}

