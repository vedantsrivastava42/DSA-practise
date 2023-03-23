import java.util.Arrays;

class concatenation {
    public static void getConcatenation(int[] nums,int[] ans) {
        for(int i=0;i<nums.length;i++){
           ans[i] = nums[i];
           ans[i+nums.length]=nums[i];
                }
            System.out.println(Arrays.toString(ans));
        }

        public static void main(String[] args) {
            int[] nums={1,2,5};
            int[] ans=new int[2*nums.length];
            getConcatenation(nums,ans);
        }
           
        
    
    }
    
