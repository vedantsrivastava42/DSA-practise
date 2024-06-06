class quicksort {
    static int partition(int[] arr, int lb, int ub){
        int start=lb;
        int end=ub;
        int pivot=arr[lb];
        while(start<end){
        while(arr[start]<=pivot){
        start++;}
        while(arr[end]>pivot){
        end--;}
            if(start<end)
            swap(arr,start,end);
        }
        swap(arr,lb,end);
        return end;
    }
    static void quick(int[] arr, int lb,int ub){
        if(lb<ub){
            int loc=partition(arr, lb, ub);
            quick(arr, lb, loc-1);
            quick(arr,loc+1,ub);
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
        quick(arr,0,arr.length-1);
        printArray(arr);
    } 
}
