class selectionsort {
    static void selection (int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            int min=i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[min])
                min=j;
        }
            if(min!=i)
            swap(arr,i,min);
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
        selection(arr);
        printArray(arr);
    }}
