import java.util.Arrays;
class cyclic {
    public static void main(String[] args) {
        int[] arr={2,5,3,4,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr.length-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else 
            i++;
        }
    }
        static void swap(int[] arr,int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
    
    
}
