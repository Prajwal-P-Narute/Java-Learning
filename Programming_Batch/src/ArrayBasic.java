import java.util.Scanner;
public class ArrayBasic {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter the size of an array ");
	int size = sc.nextInt();
	
	int[] arr = new int[size];
	System.out.println(" enter the elements of an array ");
     
	
	// for taking inputs from the user in the array
	
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	
	 System.out.println(" elements of an array are ");
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+ " ");
	}

}
}
