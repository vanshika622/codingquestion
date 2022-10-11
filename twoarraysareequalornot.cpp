#include<bits/stdc++.h>
#define ll long long
using namespace std;
bool solve( vector<ll, ll>A, vector<ll, ll>B){
  unordered_map<ll,ll>mp;
        for(int i=0;i<A.size();i++){
            mp[A[i]]++;
        }
       
        for(int i=0;i<B.size();i++){
            if(mp.find(B[i])==mp.end()){
                 return false;
                }
            if(mp[B[i]]==0) return 0;
            mp[B[i]]--;
        }
        
        return true;
    }
int main(){
  int n;
  cin>>n;
  vector<ll, ll>A(n,0);
  vector<ll, ll>B(n,0);
  for(int i=0;i<n;i++){
    cin>>A[i];
  }
  for(int i=0;i<n;i++){
    cin>>B[i];
  }
    cout<<solve(A,B);
}
