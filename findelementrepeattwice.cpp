int findDuplicate(vector<int> &arr) 
{
    int ans=0;
    for(auto i:arr){
        ans=ans^i;
    }
    for(int i=1;i<arr.size();i++){
        ans=ans^i;
    }
    return ans;
    
	
}
Footer
© 2022 GitHub, Inc.
