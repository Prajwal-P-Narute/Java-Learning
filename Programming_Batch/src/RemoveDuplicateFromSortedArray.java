import java.util.Arrays;
public class RemoveDuplicateFromSortedArray {
	
	
	public static int[] RemoveDuplicates(int [] arr) {
		int[] arr2 = new int[arr.length];
		
		arr2[0] = arr[0];
		int k = 0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr2[k]) {
				arr2[++k] = arr[i];
			}
		}
		
		
		arr2 = Arrays.copyOf(arr2, k+1); // this function is necessary to trim array i.e arr2 in the
		// arr2 with size exactly of new size of arr2 so that for printing of array becomes easy
		
		return arr2;
		
		
		
	}
        public static void main(String[] args) {
        	int []a  = {1,2,3,3,4,4,4,4,5,6,7,9,9};
        	
        	int []new_arr = RemoveDuplicates(a);
        	
        	
        	for(int i=0;i<new_arr.length;i++) {
        		System.out.println(new_arr[i]);
        	}
        	
        	
        }
}
