package easy;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(new PalindromeNumber().isPalindrome(1000021));
	}

	public boolean isPalindrome(int x) {
		if(x<0){
			return false;
		}
		int base=1;
		while(x/base >=10){
			base*=10;
		}
		while(x!=0){
			int left=x/base;
			int right=x%10;
			if(left==right){
				x-=base*left;
				x=x/10;
				base/=100;
			}else
				return false;
		}
		return true;
	}
}
