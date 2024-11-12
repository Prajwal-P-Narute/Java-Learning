 class HelperMain {
	 
	 public static void main(String[] args) {
      HelperMethod hel = new HelperMethod();
      
      hel.Name("Prajwal"); 
      System.out.println(hel.Name());
      // here we can use any name for set method and also for get method
//      While the above code is functionally equivalent to the previous example using "get" and "set," 
      //it does not follow standard conventions, which can lead to confusion and potential issues with 
      //tool compatibility and code readability.
     
      
      hel.setLoc("Barshi");
     System.out.println( hel.getLoc());
     
     hel.setContact(8007808212l);
     System.out.println(hel.getContact());
     
     
     
	 }
}
