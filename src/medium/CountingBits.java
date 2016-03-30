package medium;

public class CountingBits {
	public int[] countBits(int num) {
        int[] res=new int[num+1];
        for(int i=1;i<num+1;i++){
        	res[i]=res[i/2]+i%2;
        }
        return res;
    }
}
