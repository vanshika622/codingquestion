#include <iostream>

using namespace std;
bool flygame(int n, int arr[]){
  if(arr[0]==0)
    return false;
  int maxReach=arr[0];
  int step=arr[0];
  int ans=1;
  
  for(int i=0;i<n;i++){
    if(i==n-1)
      return ans;
    maxReach= max(maxReach, i+arr[i]);
    step--;
    
    if(step==0)jumps++;
    if(i>=maxReach) return false;
    
    step=maxReach-i;
  }
}
    
return false;
  
}
int main()
{
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }
  cout<<flygame(n, arr)<<"\n";
}
