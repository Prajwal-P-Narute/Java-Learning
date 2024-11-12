
 class College {
	 
	 public static String collegeName;
	 
	 static {
		 collegeName = "SVERI";
	 }
	 public static void print() {
		 System.out.println(collegeName);
	 }
	 
 }
 class Student{
	 public static void main(String[] args) {
		 
		 College.print();
	 }

	
}
