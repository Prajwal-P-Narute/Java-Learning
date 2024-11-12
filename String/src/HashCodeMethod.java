 class HashCodeMethod {
	 String email;
     long mobile;
     String password;
     
     public HashCodeMethod(String email, long mobile, String password) {
    	 this.email = email;
    	 this.mobile = mobile;
    	 this.password = password;
    	 
     }
     
     public static void main(String [] args) {
    	 HashCodeMethod m1 = new HashCodeMethod("Ramesh@gmail.com", 9876543210l, "Ramesh@123");
    	 System.out.println(m1.hashCode());
    	 
    	 HashCodeMethod m2 = m1;
    	 System.out.println(m2.hashCode());
    	 
    	 HashCodeMethod m3 = new HashCodeMethod("Ram@gmail.com", 9876543219l, "Ram@123");
    	 System.out.println(m3.hashCode());
    	 
    	 System.out.println(m1.hashCode() == m2.hashCode());
    	 
    	 System.out.println(m1.hashCode() == m3.hashCode());
    	 
    	 
    	 
     }
}
