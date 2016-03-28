package easy;

public class NumberOf1Bits {
	public int hammingWeight(int n) {
		int count=0;
		for(int i=0;i<32;i++){
			if((n&1)==1)
				count++;
			n=n>>1;
		}
        return count;
    }
	public static void main(String[] args){
		System.out.println(new NumberOf1Bits().hammingWeight(11));
		System.out.println(11&8);
	}
}
