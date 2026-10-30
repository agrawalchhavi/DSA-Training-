
//used to store the frequency of the elements in the array -- hash map 
import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        HashMap<Integer, Integer> h1 = new HashMap<>();

        h1.put(1, 100);
        h1.put(2, 200);
        h1.put(3, 300);

        System.out.println(h1);

        //System.out.println(h1.get(4));
    }
}