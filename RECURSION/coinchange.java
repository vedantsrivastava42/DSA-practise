class coinchange {
    public static void main(String[] args) {
        int[] arr={2};
        int target=3;
        System.out.println(coin(arr, target));
    }
    static int coin(int[] arr, int target){
        if(target == 0)
        return 0;
        if(target<0)
        return Integer.MAX_VALUE;

        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
           int ans= coin(arr,target-arr[i]);
           if(ans!=Integer.MAX_VALUE)
            min=Math.min(min,ans+1);
            //jab min me koi value jaa rha toh min me 1 add kro qki 1 aur combination mil gya
        }

        return min;

    }
}
