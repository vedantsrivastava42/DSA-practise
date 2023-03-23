class linearrange
{
    public static void main(String[] args) {
        int[] arr={1,2,5,6,3,66};
        int target=2;
        boolean ans=linearsearch(arr,target,1,4);
        System.out.println(ans);
         
    }
    static boolean linearsearch(int[] arr,int target,int start,int end){
        if (arr.length==0)
        return false;
       for (int index=start;index<=end;index++){
        if(arr[index]==target)
        return true;
       }
       return false;

    }
}
