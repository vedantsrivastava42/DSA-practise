class missing_number {
    
   public static void main(String[] args) 
    
    {
                int i=0;
                int[] arr={0,1,4,5,3};
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else 
                i++;
            }
        for(int j=0;j<arr.length;j++){
            if (arr[j]!=j)
                System.out.println(j);
        }
        
            
    }
}
