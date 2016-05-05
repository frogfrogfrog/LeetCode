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
    public static void main(String[] args){
    	new UniquePaths().uniquePaths(51,9);
    }
}
