class removechar {
//Kunal Kushwaha video-32 Subset,Subsequence,String 
    public static void main(String[] args) {
        skip("","baccad");
        skip2("baccad");
    }
    static void skip(String ans,String q){
        if(q.isEmpty()){
            System.out.println(ans);
            return;
        }

        if(q.charAt(0)!='a')
        skip(ans+q.charAt(0),q.substring(1));
        else
        skip(ans,q.substring(1));
    }

static void skip(String ans,String q){
    if(q.isEmpty()){
        System.out.println(ans);
        return;
    }

    if(q.charAt(0)!='a')
    skip(ans+q.charAt(0),q.substring(1));
    else
    skip(ans,q.substring(1));
}
}