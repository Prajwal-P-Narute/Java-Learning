 class Customer {

	 
	 public static void main(String[] args) {
		 Employee e1 = new Employee("Ramesh", 01, 34500.00);
		 
//		 e1.setId(01);
		 System.out.println(e1.getId());// accessing private variable with the help of getter method
		 // System.out.println(e1.eid); CTE (variable is private you cannot access it directly)
		 
		 e1.setEname("Suresh"); // passing the new name in setter method to modify
		 System.out.println(e1.getEname()); // again accessing the new name of emp
	 }
}
