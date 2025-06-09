
public class First10EvenNumInReverseOrder {
	public static void main(String[] args) {
	
	int num = 20;
	evenNum(num);

}
	public static void evenNum(int num) {
		
		int count = 0;
		
		while(count<10) {
			if(num%2==0) {
				System.out.println(num);
				count++;
			}
			num--;
		}
	}
}