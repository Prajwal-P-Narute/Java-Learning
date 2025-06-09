// write a program to manipulate given string in such a way that reverse the string
// but special characters should remain at their original position.
// input string : "He#ll$o"
// output string : "ol#le$H"
 class Program7 {
  public static void main(String[] args) {
	String str = "H@el#lo$";
	char[] arr = str.toCharArray();
	int start = 0;
	int end = str.length() - 1;
	
	while(start<end) {
		if(Character.isAlphabetic(arr[start]) && Character.isAlphabetic(arr[end])) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
		}
		else if(Character.isAlphabetic(arr[start])) {
			end--;
		}
		else {
			start++;
		}
	}
	
	String res = new String(arr);
	System.out.println(res);
}
}
