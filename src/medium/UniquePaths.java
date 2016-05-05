package medium;

public class UniquePaths {
	private int comb(int n, int m) {
        long res=1;
        for(int i=1;i<=m;i++){
        	res*=i+n-m;
        	System.out.println(res);
        	res/=i;
        	System.out.println(res);
        }
        return (int) res;
    }

    public int uniquePaths(int m, int n) {
        return comb(m + n - 2, n-1);
    }
    
    
    public int uniquePathsDP(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		if(i==0 || j==0)
        			dp[i][j]=1;
        		else
        			dp[i][j]=dp[i][j-1]+dp[i-1][j];
        	}
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args){
    	new UniquePaths().uniquePaths(51,9);
    }
}
