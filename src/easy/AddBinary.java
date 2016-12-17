package easy;

/**
 * Created by 42160 on 2016/12/14.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int pos1 = a.length() - 1, pos2 = b.length() - 1;
        int flag = 0;
        while (pos1 >= 0 || pos2 >= 0) {
            int sum = flag;
            if (pos1 >= 0) {
                sum += a.charAt(pos1) - '0';
                pos1--;
            }
            if (pos2 >= 0) {
                sum += b.charAt(pos2) - '0';
                pos2--;
            }
            sb.insert(0, sum % 2);
            flag = sum / 2;
        }
        if (flag != 0)
            sb.insert(0, '1');
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.print(new AddBinary().addBinary("11", "1"));
        System.out.println((int) '1' ^ (int) '0' ^ 0);
    }
}
