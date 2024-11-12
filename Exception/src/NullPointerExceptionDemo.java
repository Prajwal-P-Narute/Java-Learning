
 class NullPointerExceptionDemo {

		public String email;
	    public NullPointerExceptionDemo(String email) {
	    this.email = email;
	    }

		public static void main(String[] args) {
	    	 NullPointerExceptionDemo user1 = new NullPointerExceptionDemo("Ramesh@gmail.com");
	    	 user1 = null;
	    	 System.out.println("Start of the Program");
	    	 try {
	    	 System.out.println(user1.email);
	    	 }
	    	 
	    	 catch(NullPointerException e){
	    		 
	    	 }
	       
	    	 System.out.println("End of the Program");
		
	}

}
