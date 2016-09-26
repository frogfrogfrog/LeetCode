package easy;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		int size=strs.length;
		String res="";
		if(size<=0)
			return res;
		int index=0; 
		while(true){
			if(index>=strs[0].length())
				break;
			char c=strs[0].charAt(index);
			boolean noCommon=false;
			for(int i=1;i<size;i++){
				if(index>=strs[i].length() || strs[i].charAt(index)!=c){
					noCommon=true;
					break;
				}
			}
			if(noCommon)
				break;
			else{
				index++;
				res+=c;
			}
		}
		return res;
	}
}
