class linear {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,3,66};
        int target=6;
        boolean ans=linearsearch(arr,target);
        System.out.println(ans);
         
    }
    static boolean linearsearch(int[] arr,int target){
        if (arr.length==0)
        return false;
       for (int index=0;index<arr.length;index++){
        if(arr[index]==target)
        return true;
       }
       return false;

    }
}
