package medium;

public class SearchForARange {
	public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        res[0]=res[1]=-1;
        int left=0,right=nums.length-1;
        //要有"="号，防止只有一个元素的情况
        while(left<=right){
        	int mid=(left+right)/2;
        	if(nums[mid]==target){
        		res[0]=res[1]=mid;
        		int i=mid-1;
        		while(i>=0 && nums[i]==target){
        			res[0]=i;
        			i--;
        		}
        		i=mid+1;
        		while(i<=nums.length-1 && nums[i]==target){
        			res[1]=i;
        			i++;
        		}
        		break;
        	}
        	if(nums[mid]<target){
        		left=mid+1;
        		continue;
        	}
        	if(nums[mid]>target){
        		right=mid-1;
        		continue;
        	}
        }
        return res;
    }
	public static void main(String[] args){
		
	}
	
}
