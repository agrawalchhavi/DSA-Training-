import java.util.*;

public class minimumplatforms {
public static void main(String[] args) {
    int arr[] = {900, 940, 950, 1100, 1500, 1800};
    int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

    Arrays.sort(arr);
    Arrays.sort(dep);

    int i = 1, j = 0, plat = 1, max = 1;
    int n = arr.length;

    while (i < n && j < n) {
        if (arr[i] <= dep[j]) {
            plat++;
            i++;
        } else {
            plat--;
            j++;
        }
        max = Math.max(max, plat);
    }

    System.out.println("Minimum Platforms: " + max);
}

}