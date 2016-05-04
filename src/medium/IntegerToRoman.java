package medium;

public class IntegerToRoman {
	public String intToRoman(int num) {
		String roman="";
        String[][] trans={{"","I","II","III","IV","V","VI","VII","VIII","IX"},
        		{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
        		{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
        		{"","M","MM","MMM"}};
        roman+=trans[3][num/1000%10];
        roman+=trans[2][num/100%10];
        roman+=trans[1][num/10%10];
        roman+=trans[0][num%10];
        return roman;
    }
}
