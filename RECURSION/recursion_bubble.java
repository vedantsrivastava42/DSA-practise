import java.util.Arrays;

class recursion_bubble {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int i, int j) {
            if (i == 0) {
                return;
            }
       if(j<i){
        //till j<i if j==i that is the last element(already sorted)
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
        bubble(arr,i,j+1);
       }
       else{
        //when last element is reached decrease i and j=0.
        bubble(arr,i-1,0);
       }
}
}