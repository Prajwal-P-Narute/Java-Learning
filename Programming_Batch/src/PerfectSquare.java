
public class PerfectSquare {

	public static void main(String[] args) {
	  
		int num  = 64;
		
		int res = 0;
		int sqrt = 0;
		
		for(int i = 1;res <= num; i++) {
			
			res = i*i;
			
			if(res == num) {
				sqrt = i;
				break;
			}
		}
		if(num == res) {
			System.out.println(num + " is a perfect square");
		}else
			System.out.println(num + " is not a perfect square");

	}

}
