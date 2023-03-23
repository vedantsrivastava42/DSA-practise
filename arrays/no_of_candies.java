class no_of_candies {
public static void main(String[] args) {
    int[] a={4,2,1,1,2};
    int c=1;
   int m=a[0];
    for(int i=0;i<a.length;i++){
     if(a[i]>m)
     m=a[i];
    }
   for(int i=0;i<a.length;i++){
    
      if(a[i]+c>=m)
      System.out.println(true);
      else
    System.out.println(false);

}
}
}