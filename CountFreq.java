import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class CountFreq {
    public static void main(String[] args) {


        int[] a = {1, 1, 2, 2, 1, 2, 9};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : a) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(map);
    }
}
