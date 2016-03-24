package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> res=new ArrayList<Integer>();
		for(int i=0;i<=rowIndex;i++){
			res.add(1);
			for(int j=i-1;j>0;j--){
				res.set(j, res.get(j)+res.get(j-1));
			}
		}
		return res;
	}
}
