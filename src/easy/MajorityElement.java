package easy;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		int count=0;
		int majority=0;
		for(int i:nums){
			if(count==0)
				majority=i;
			count+=(i==majority)?1:-1;
		}
		return majority;
	}
}
