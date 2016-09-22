package easy;

public class FindTheDifference {
	public char findTheDifference(String s, String t) {
		int result=0;
		for(char a:s.toCharArray())
			result^=(int)a;
		for(char a:t.toCharArray())
			result^=(int)a;
		return (char)result;
    }	
}
