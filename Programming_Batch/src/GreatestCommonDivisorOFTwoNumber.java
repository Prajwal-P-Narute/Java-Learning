
public class GreatestCommonDivisorOFTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int num1 = 5;
            int num2 = 7;
            
            
//            int largNum = num1;
//            if(num1>num2)
//            	largNum = num1;
//            else
//            largNum = num2;
//            
//            int greatestNum = 1;
//            
//            for(int i = largNum/2;i>=2;i--) {
//            	
//            	if(num1 % i==0 && num2 % i==0) {
//            		greatestNum = i;
//            		break;
//            	}
//            	
//            }
//            
//            System.out.println(greatestNum);
            
            int gcd = 0;
            for(int i=1; i<=num1 && i<=num2; i++) {
            	if(num1%i==0 && num2 %i == 0) {
            		gcd = i;
            	}
            }
            
            System.out.println(gcd);
	}

}
