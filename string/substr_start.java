class substr_start {
    public static int substr(String s,Character c){
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
            ans+=n-i;
        }
    }
        return ans;
    }
    public static void main(String[] args) {
        String s="ababa";

        System.out.println(substr(s,'a'));
    }
}
