public class Solution {
	public static int countOnBits(int num) {
		int count=0;
        while(num!=0){
            count+= num&1;
            num=num>>1;
        }
        
        return count;
	}
}
