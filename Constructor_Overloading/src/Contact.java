
 class Contact {
          private String firstName;
          private String lastName;
          private long mobile;
          private long work;
          private int home;
          
          public Contact(String firstName, String lastName) {
        	  this.firstName = firstName;
        	  this.lastName = lastName;
          }
          
          public Contact(String firstName, String lastName, long work) {
        	  this.firstName = firstName;
        	  this.lastName = lastName;
        	  this.work = work;
          }
          
          public Contact(String firstName, int home) {
        	  this.firstName = firstName;
        	  this.home = home;
          }
          
          public void print() {
        	  
        	  System.out.println(  this.firstName );
        	  System.out.println(  this.lastName );
        	  System.out.println( this.mobile);
        	  System.out.println(  this.work);
        	  System.out.println( this.home);
        	  
        	  
        	
        	 
        	  
        	
        	 
          }
          
          public static void main(String[] args) {
        	  
        	 Contact c1 = new Contact("Ramesh", "Yadav");
        	 c1.print();
        	 
        	 Contact c2 = new Contact("Umesh", "Yadav", 782442282833l);
        	 c2.print();
        	 
        	  
          }
}
