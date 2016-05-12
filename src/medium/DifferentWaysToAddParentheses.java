package medium;

import java.util.LinkedList;
import java.util.List;

public class DifferentWaysToAddParentheses {
	public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res=new LinkedList<Integer>();
        for(int i=0;i<input.length();i++){
        	char c=input.charAt(i);
        	if(c=='+' || c=='-' || c=='*' || c=='/'){
        		List<Integer> leftRes=diffWaysToCompute(input.substring(0, i));
        		List<Integer> rightRes=diffWaysToCompute(input.substring(i+1, input.length()));
        		for(int j=0;j<leftRes.size();j++){
        			for(int k=0;k<rightRes.size();k++){
        				switch(c){
                		case'+':
                			res.add(leftRes.get(j)+rightRes.get(k));
                			break;
                		case'-':
                			res.add(leftRes.get(j)-rightRes.get(k));
                			break;
                		case'*':
                			res.add(leftRes.get(j)*rightRes.get(k));
                			break;
                		case'/':
                			res.add(leftRes.get(j)/rightRes.get(k));
                			break;
                		}
            		}
        		}
        	}
        }
        if(res.size()==0)
        	res.add(Integer.valueOf(input));
        return res;
    }
	public static void main(String[] args){
		System.out.println("sfef".substring(0, 1));
	}
}
