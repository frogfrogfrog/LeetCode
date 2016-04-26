package easy;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		if(numRows==1)
			return s;
		int size=s.length();
		char[] ss=new char[size];
		int pos=0;
		int step=2*numRows-2;
		for(int i=0;i<numRows;i++){
			int j=i;
			if(i==0 || i==numRows-1){
				while(j<size){
					ss[pos]=s.charAt(j);
					j+=step;
					pos++;
				}
			}else{
				int k=step-i*2;
				while(j<size){
					ss[pos]=s.charAt(j);
					j+=k;
					k=step-k;
					pos++;
				}
			}
		}
		return new String(ss);
    }
}
