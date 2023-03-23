import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
//442 find all duplicates in an array
class allduplicates {
 public static void main(String[] args) {
    
    int i=0;
int[] arr={4,3,2,7,8,2,3,1};
    while(i<arr.length){
       
        int correct=arr[i]-1;
        if(arr[i]!=arr[correct]){
            int temp=arr[i];
            arr[i]=arr[correct];
            arr[correct]=temp;
        }
        else 
        i++;
        }
        
      List<Integer> ans=new ArrayList<>();
        for (int j=0;j<arr.length;j++){
            if(arr[j]!=(j+1)){
                ans.add(arr[j]);
            }
    }
    System.out.println(ans);
}
}