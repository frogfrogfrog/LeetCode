package medium;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberIII {
	public int[] singleNumber(int[] nums) {
		Set<Integer> set=new HashSet<Integer>();
        int size=nums.length;
        for(int i=0;i<size;i++){
        	if(!set.add(nums[i]))
        		set.remove(nums[i]);
        }
        int[] res=new int[set.size()];
        int i=0;
        for(int num:res){
        	res[i]=num;
        	i++;
        }
        return res;
    }
}
