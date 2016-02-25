package easy;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(new ReverseInteger().reverse(-2147483412));
	}

	public int reverse(int x) {
		int max = Integer.MAX_VALUE / 10;
		boolean isNegative = false;
		if (x < 0) {
			isNegative = true;
			x = -x;
			if(x<0)
				return 0;
		}
		int ret = 0;
		while (x != 0) {
			if (ret > max || (ret == max && isNegative && x > 8) || (ret == max && !isNegative && x > 7)) {
				return 0;
			}
			ret = ret * 10 + x % 10;
			x = x / 10;
		}
		return isNegative ? ret *= -1 : ret;
	}
}
