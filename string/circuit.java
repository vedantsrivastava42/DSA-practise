class circuit {
    public static void main(String[] args) {
        int[] arr = {1,-6,-5,-12,1,3,8,-3,5,-87};
        int c=0;
        int[] ans=new int[arr.length*2];
        int idx=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                ans[idx]=arr[i];
                idx=idx+2;
            }
        }
        idx=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ans[idx]=arr[i];
                idx=idx+2;
            }
        }  
      
        for(int i=0;i<ans.length;i++){
            if(i%2==0)
            c+=ans[i];
            else if(i%2==1)
            c-=ans[i];
        }
    
System.out.println(c);
}
}