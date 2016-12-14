package easy;

/**
 * Created by 42160 on 2016/12/14.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int pos1 = a.length() - 1, pos2 = b.length() - 1;
        boolean flag = false;
        while (pos1 >= 0 && pos2 >= 0) {
            if (a.charAt(pos1) == '1' && b.charAt(pos2) == '1') {
                if (flag == true)
                    sb.insert(0, '1');
                else
                    sb.insert(0, '0');
            } else if (a.charAt(pos1) == '0' && b.charAt(pos2) == '0') {
                if (flag == true) {
                    sb.insert(0, '1');
                    flag = false;
                } else
                    sb.insert(0, '0');
            } else {
                if (flag == true)
                    sb.insert(0, '0');
                else {
                    sb.insert(0, '1');
                }
            }
        }
        return sb.toString();
    }
}
