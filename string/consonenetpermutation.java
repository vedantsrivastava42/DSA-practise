class consonenetpermutation {
public static void main(String[] args) {
    String S="ABCDAEH";
    String v="aeiouAEIOU";
    int c=0;
    for(int i=0;i<S.length();i++) {
        if(v.indexOf(S.charAt(i)) == -1)
        c++;
}
int ans=factorial(c);
System.out.println(ans);
    }

public static int factorial(int n){
    if(n==0 || n==1)
    return n;

    return n * factorial(n-1);
}
}
