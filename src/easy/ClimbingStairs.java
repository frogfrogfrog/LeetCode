package easy;

public class ClimbingStairs {
	public int climbStairs(int n) {
		if(n<=2)
			return n;
		int prev=1;
		int cur=1;
		int temp=0;
        for(int i=0;i<n-1;i++){
        	temp=prev+cur;
        	prev=cur;
        	cur=temp;
        }
        return cur;
    }
}
