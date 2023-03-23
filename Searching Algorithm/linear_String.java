class linear_String {
    public static void main(String[] args) {
        String str="vedant";
        char target='x';
        System.out.println(LinearString(str,target));
    }
    static boolean LinearString(String str,int target){
        if (str.length()==0)
        return false;
        for (int i=0;i<str.length();i++){
            if(target==str.charAt(i))
            return true;
        }
        return false;
    }

}
