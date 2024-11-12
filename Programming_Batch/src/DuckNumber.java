// 024 - Not A duck number
// 2012 - Duck number
// 1234  - Not a duck number
public class DuckNumber {

	public static void main(String[] args) {
	int num = 2024;
	int copy = num;
	boolean flag = false;
	
	
	  
	
	while(num>9) {
		int dig = num % 10;
		
	    if(dig == 0) {
	    	
	    	flag = true;
	    	break;
	    }
	    
	    num /=10; 
		
	}
	
	if(flag)
		System.out.println(" duck number");
	else
		System.out.println("not a duck number");

	}

}
