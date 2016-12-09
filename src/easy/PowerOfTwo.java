package easy;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return ((n & n - 1) == 0 && n > 0);
    }

    public static void main(String[] args) {
        System.out.println(Math.log10(3));
    }
}
