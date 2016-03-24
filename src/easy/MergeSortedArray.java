package easy;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int i=0;i<m;i++){
			nums1[m+n-i-1]=nums1[m-i-1];
		}
		int cur1=n,cur2=0,count=0;
		while(cur1<m+n && cur2<n){
			if(nums1[cur1]<nums2[cur2]){
				nums1[count]=nums1[cur1];
				cur1++;
			}else{
				nums1[count]=nums2[cur2];
				cur2++;
			}
			count++;
		}
		while(cur1<m+n){
			nums1[count]=nums1[cur1];
			cur1++;
			count++;
		}
		while(cur2<n){
			nums1[count]=nums2[cur2];
			cur2++;
			count++;
		}
	}
}
