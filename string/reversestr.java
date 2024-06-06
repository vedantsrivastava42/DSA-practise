class reversestr {
    public static String isSubstringPresent(String s) {
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        for(int i=0;i<s.length()-1;i++){
          for(int j=i+1;j<s.length();j++){
            if(rev.contains(s.substring(i,j+1)))
                return s.substring(i,j+1);
          }}
        return "";
    }
    public static void main(String[] args) {
        String s="abab";
        System.out.println(isSubstringPresent(s));

    }
}
