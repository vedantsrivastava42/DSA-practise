import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class frequency {

    public static int freq(int[] nums) {
         HashMap <Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        //Add all elements to hashmap with frequency
        for(int i=0;i<nums.length;i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       for(int i : map.values()){
       list.add(i);
       }
    
       int count=0;
       Collections.sort(list);
       int max=list.get(list.size()-1);
       for(int i=list.size()-1;i>0;i--){
         if(list.get(i)==max)
         count+=max;
       }  
       System.out.println(list);
       return count;
             }

    
    
    public static void main(String[] args) {
        int[] nums= {1,2,2,3,1,4};
        System.out.println(freq(nums));
    }
}
