class stringsub {
    public static void printsub(String str,String op,int i){

        if(i>=str.length()){
        System.out.println(op);
        return;
        }
        printsub(str, op, i+1);

        op=op+str.charAt(i);
        printsub(str, op, i+1);

    }
    public static void main(String[] args) {
        String str="abc";
        String output="";
        int i=0;
       printsub(str,output,i);
    }
   
}
