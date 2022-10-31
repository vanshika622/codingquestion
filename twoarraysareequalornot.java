class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        HashMap<Long , Integer>mp= new HashMap<>();
        for(int i=0;i<N;i++){
            if(mp.containsKey(A[i])){
                mp.put(A[i], mp.get(A[i]) + 1);
            }
            else{
                mp.put(A[i], 1);
            }
        }
        int count=0;
        for (int i = 0; i < N; i++) {
 
            
            if (!mp.containsKey(B[i]))
                return false;
 
           
            if (mp.get(B[i]) == 0)
                return false;
 
            count = mp.get(B[i]);
            --count;
            mp.put(B[i], count);
        }
        
        return true;
    }
}
