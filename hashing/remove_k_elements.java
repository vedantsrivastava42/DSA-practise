import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//LC 1481. Least Number of Unique Integers after K Removals
public class remove_k_elements {
    // public static void findLeastNumOfUniqueInts(int[] arr, int k) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for (int x : arr) {
    //         map.put(x, map.getOrDefault(x, 0) + 1);
    //     }
    //     List<Map.Entry<Integer, Integer>> elements = new ArrayList<>(map.entrySet());
    //     System.out.println(elements);
    //     elements.sort((a, b) -> a.getValue() - b.getValue());
    //     System.out.println(elements);

    //     for (Map.Entry<Integer, Integer> entry : elements) {
    //         if (entry.getValue() <= k) {
    //             k -= entry.getValue();
    //             System.out.println(entry.getKey());
    //             map.remove(entry.getKey());
    //         } else {
    //             break;
    //         }
    //     }
    //     System.out.println(map);
    //     System.out.println(map.size()); 
    // }
      public static void findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int a : arr) mp.put(a, mp.getOrDefault(a, 0) + 1);
        
        List<Integer> v = new ArrayList<>();
        int cnt = 0;
        for (int a : mp.values()) {
            v.add(a);
        }
        Collections.sort(v);
        //System.out.println(v);

        for (int i = 0; i < v.size(); i++) {
            if (k > v.get(i)) {
                k -= v.get(i);
                v.set(i, 0);
                System.out.println(v);
            } else {
                v.set(i, v.get(i) - k);
                System.out.println(v);
                k = 0;
            }
          
            if (v.get(i) != 0) cnt++;
        }
      //  System.out.println(mp);
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        int[] arr =  {4,3,1,1,3,3,2};
        int k=3;
       
         findLeastNumOfUniqueInts(arr,k);
    }
}

