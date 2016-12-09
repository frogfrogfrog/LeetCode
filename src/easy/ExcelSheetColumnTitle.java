package easy;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();
        int remainder = 0;
        while (n > 0) {
            remainder = (n - 1) % 26;
            str.insert(0, (char) (remainder + 'A'));
            n = (n - remainder) / 26;
        }
        return str.toString();
    }
}
