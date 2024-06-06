class bubbleSort {
    static void bubble (int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1])
                swap(arr,j,j+1);
        }
    }
}
 static void swap(int[] arr,int i,int min){
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {7,4,10,8,3,1};
        bubble(arr);
        printArray(arr);
    }

}