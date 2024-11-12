 // This is the Best example of Compile time Polymorphism.
// in this both constructor overloading and method overloading is achieved
 class User1 {
//    public String userName;
    public String email;
    public long mobile;
    public String password;
    
    // the below constructor is created because the creating of new object passing no arguments in it
    public User1() {
    	
    }
    
    public User1(String email, String password) {
    	this.email = email;
    	this.password = password;
    	System.out.println("Trainers account is created");
    }
    public User1(long mobile, String password) {
    	this.mobile = mobile;
    	this.password = password;
    	System.out.println("Student account is created");
    	
    	
    
    	
    }
    
    public void logIn(String email, String password) {
    	System.out.println("Trainers log in successfully");
    }
    public void logIn(long mobile, String password) {
    	System.out.println("Students log in successfully");
    }
    
    public void print() {
    	System.out.println(this.email);
    	System.out.println(this.mobile);
    	System.out.println(this.password);
    	
    }
}
