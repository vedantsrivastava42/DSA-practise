import java.util.ArrayList;
import java.util.List;

class two_sum{
    public static String threeSum(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-1;i++){
          int start=i+1;
          int end=nums.length-1;
          while(start<end){
            if(nums[i]+nums[start]+nums[end]==0){
            ans.add(nums[i]);
            ans.add(nums[start]);
            ans.add(nums[end]);
            }
            else if(nums[i]+nums[start]+nums[end]<0)
            start++;
            else
            end--;
          }
          result.add(ans);
        }
        String res="";
        for(int i=0;i<result.size();i++){
            for(int j=0;j<result.get(i).size();j++){
                res+=result.get(i).get(j);
        }
        System.out.println();
    }
    return res;
    }
    public static void main(String[] args) {
        int[] nums= {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}