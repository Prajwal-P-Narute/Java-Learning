// Constructor Chaining using this call statement

class ConstructorChaining {
	private String firstName;
	private int id;
	private String address;
	private long mob;
	
	public ConstructorChaining(String firstName) {
		this.firstName = firstName;
		
	}
	
	public ConstructorChaining(String firstName, long mob, String address) {
	this(firstName, address);
	this.mob = mob;
	
	}	
	
	
	
	public ConstructorChaining(String firstName, String address) {
		this(firstName);
		this.address  = address;
		
	}
	
	public void printdetail() {
		System.out.println(this.firstName);
		System.out.println(this.address);
		System.out.println(this.mob);
	}
         public static void main(String[] args) {
        	 
        	 ConstructorChaining obj1 = new ConstructorChaining("Prajwal", 8007808212l, "Barshi" );
        	 obj1.printdetail();
        	 
        	 
    }
         
         
}
