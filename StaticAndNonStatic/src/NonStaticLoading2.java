
 class NonStaticLoading2 {
     public int id;
     public String name;
     public long mobile;
     public String email;
     public static String collegeName = "ABC";
     public static long collegeContact = 7087234567l;
     
     {
    	 System.out.println("Non-Static block called");
     }
     
     static {
    	 System.out.println("Static Block called");
     }
     
     public NonStaticLoading2(int id, String name, long mobile,  String email) {
    	 System.out.println("Constructor is invoked");
    	 this.id = id;
    	 this.name = name;
    	 this.mobile = mobile;
    	 this.email = email;
     }
     public static void m1() {
    	 System.out.println("m1() is invoked by main()");
    	 NonStaticLoading2 student1  = new NonStaticLoading2(1, "Ram", 80007808212l, "ram@gmail.com");
    	 student1.m2();
     }
     
     public void m2() {
    	 System.out.println("m2() is invoked by m1()");
    	 System.out.println(id);
    	 System.out.println(name);
    	 System.out.println(mobile);
    	 System.out.println(email);
    	 System.out.println(collegeName);
    	 System.out.println(collegeContact);
    	 
     }
     
     public static void main(String[] args) {
    	 System.out.println("main() is called by JVM");
    	 m1();
     }
}
