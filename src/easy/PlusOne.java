package easy;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int pos = digits.length - 1;
        while (carry != 0 && pos >= 0) {
            int temp = digits[pos] + carry;
            if (temp < 10)
                carry = 0;
            digits[pos] = temp % 10;
            pos--;
        }
        if (carry > 0) {
            int[] a = new int[digits.length + 1];
            System.arraycopy(digits, 0, a, 1, digits.length);
            a[0] = carry;
            return a;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{9};
        new PlusOne().plusOne(a);
    }
}
