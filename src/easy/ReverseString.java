package easy;

public class ReverseString {
	public String reverseString(String s) {
        StringBuffer sb=new StringBuffer();
        int size=s.length();
        for(int i=size-1;i>=0;i--){
        	sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
