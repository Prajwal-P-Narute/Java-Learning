
class ToStringMethod {
         String email;
         long mobile;
         String password;
         
         public ToStringMethod(String email, long mobile, String password) {
        	 this.email = email;
        	 this.mobile = mobile;
        	 this.password = password;
        	 
        	 
         }
         
         public static void main(String[] args) {
        	 
        	 
        		ToStringMethod m1 = new ToStringMethod("Ramesh@gmail.com", 9876543210l, "Ramesh@123");
        		System.out.println(m1.toString());// it returns the reference of an object
        	 	System.out.println(m1); // here by default m1.toString() gets called
        	 	// the above two print statements gets same output
        	
        	ToStringMethod m3 = new ToStringMethod("Ram@gmail.com", 9876543219l, "Ram@123");
        	System.out.println(m3); // here by default m2.toString() gets called
         }
         
         // Overriding toString() method to print properties of an object
         public String toString() {
        	 return "User[Email: " + this.email + " Mobile: " + this.mobile + " passoword: "+ this.password + "]";
         }
}
