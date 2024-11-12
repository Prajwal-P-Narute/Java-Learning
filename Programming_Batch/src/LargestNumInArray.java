
public class LargestNumInArray {
	
	public static void main(String[] args) {
		
		int[] nums = {34,1,-90,-45,1,-2,67,-40,18};
		
		
		System.out.println(largestNum(nums));
	}
	
	public static int  largestNum(int[] num) {
		
		int largeNum = num[0];
		
		for(int i=1;i<num.length;i++) {
			if(num[i]>largeNum) {
				largeNum = num[i];
			}
		}
		return largeNum;
	}

}
