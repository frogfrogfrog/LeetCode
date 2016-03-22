package easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
        int size=nums.length;
        List<String> res=new ArrayList<String>();
        if(size==0){
        	return res;
        }
        int begin=0,cur=0;
        while(cur<size){
        	if(cur<size-1 && nums[cur+1]==nums[cur]+1){
        		cur++;
        	}else if(cur==begin){
        		res.add(String.valueOf(nums[begin]));
        		cur++;
        		begin++;
        	}else{
        		res.add(String.valueOf(nums[begin])+"->"+String.valueOf(nums[cur]));
        		cur++;
        		begin=cur;
        	}
        }
        return res;
    }
}
