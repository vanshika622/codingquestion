#include<bits/stdc++.h>
using namespace std;
int firstElementKTime(int a[], int n, int k)
    {
        unordered_map<int, int>mp;
        for(int i=0;i<n;i++){
            if(mp[a[i]]){
                mp[a[i]]++;
                
            }
            else{
                mp[a[i]]=1;
                
            }
            if(mp[a[i]]==k) return a[i];
        }
        return -1;
    }
int main(){
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }
  int k;cin>>k;
  cout<<firstElementKTime(arr,n,k)<<"\n";
  
}
