class palindrome_sen {
    public static String isPalindrome(String s) {
        String rev="";
        String str="";
        int i=0;
        while(i<s.length()){
          char ch=s.charAt(i);
          if(ch>=48 && ch<58 || ch>=65 && ch<91 || ch>=97 && ch<123){
            rev=rev+ch;
            i++;
          }
          else
          i++;
        }
        int j=s.length()-1;
        while(j>=0){
          char ch=s.charAt(j);
          if(ch>=48 && ch<58 || ch>=65 && ch<91 || ch>=97 && ch<123){
            rev=rev+ch;
            j--;
          }
          else
          j--;
        }
          if(rev=="")
          return "false";

          rev= rev.toLowerCase();
           //if(s.equals(rev))
          return rev;

        //   return "false";
      }
      public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
      }
}
