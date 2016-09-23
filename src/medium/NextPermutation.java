package medium;

/**
 * 
 * @author yzx12
 *http://blog.csdn.net/qq575787460/article/details/41215475
 */
public class NextPermutation {
	public static void main(String[] args){
		int[] a=new int[]{1,3,2};
		new NextPermutation().nextPermutation(a);
		for(int i:a){
			System.out.print(i+",");
		}
	}
	public void nextPermutation(int[] nums) {
		int size=nums.length;
		int pos=size-2;
		while(pos>=0 && nums[pos]>=nums[pos+1])
			pos--;
		if(pos>=0){
			int i=pos+1;
			while(i<size && nums[i]>nums[pos])
				i++;
			int temp=nums[pos];
			nums[pos]=nums[i-1];
			nums[i-1]=temp;
		}
		
		int begin=pos+1;
		int end=size-1;
		while(begin<end){
			int temp=nums[begin];
			nums[begin]=nums[end];
			nums[end]=temp;
			begin++;
			end--;
		}
	}
}
