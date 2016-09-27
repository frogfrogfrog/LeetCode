package medium;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int max=0,left=0,right=height.length-1;
		while(left<right){
			int tmp;
			if(height[left]<height[right]){
				tmp=height[left]*(right-left);
				int i=left+1;
				while(i<right && height[i]<=height[left]){
					i++;
				}
				left=i;
			}else{
				tmp=height[right]*(right-left);
				int i=right-1;
				while(i>left && height[i]<=height[right]){
					i--;
				}
				right=i;
			}
			if(max<tmp)
				max=tmp;
		}
		return max;
	}
}
