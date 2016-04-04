package easy;

public class PowerOfThree {
	public boolean isPowerOfThree(int n) {
        int maxPow3= (int) Math.pow(3, (int)(Math.log(Integer.MAX_VALUE)/Math.log(3)));
        return n>0 && maxPow3%n==0;
    }
	public static void main(String[] args){
		System.out.println((int) Math.pow(3, (int)(Math.log(Integer.MAX_VALUE)/Math.log(3)))%3);
	}
}
