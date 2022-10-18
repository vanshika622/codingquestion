public class Solution {
 public static void swap(int a[], int fir, int sec){
     int temp=a[fir];
     a[fir]=a[sec];
     a[sec]=temp;
 }
  public static int[] parityMove(int a[], int n) {
     int i=0;
      int j=n-1;
      while(i<=j){
          if(a[i]%2==0 && a[j]%2!=0){
              i++;
              j--;
          }
          else if(a[i]%2!=0 && a[j]%2==0){
              swap(a,i,j);
              i++;
              j--;
          }
          else if(a[i]%2==0 && a[j]%2==0){
              i++;
          }
          else if(a[i]%2!=0 && a[j]%2!=0){
              j--;
          }
      }
      return a;
    
  }
}
