package easy;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		int size=s.length();
		int[] coefficient=new int[size];
		int start=1;
		int i=size-1;
		while(i>=0){
			coefficient[i]=start;
			start*=26;
			i--;
		}
		int res=0;
		for(int j=0;j<size;j++){
			int temp=(s.charAt(j)-'A')+1;
			res+=temp*coefficient[j];
		}
		return res;
    }
}
