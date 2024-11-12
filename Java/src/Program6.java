
public class Program6 {
public static void main(String[] args) {
	String str = "hello world";
	String temp = "";
	if(str.length()%2 == 0) {
		for(int i=0;i<str.length();i++) {
			if(i%2 == 0 && str.charAt(i)>='a' && str.charAt(i)<= 'z') {
				temp += (char) (str.charAt(i) - 32);
				
			}
			else {
				temp += str.charAt(i);
			}
		}
	}
	else {
		for(int i=0;i<str.length();i++) {
			if(i%2 == 1 && str.charAt(i)>='a' && str.charAt(i)<= 'z') {
				temp += (char) (str.charAt(i) - 32);
				
			}
			else {
				temp += str.charAt(i);
			}
		}
		
	}
	System.out.println(temp);
}
}
