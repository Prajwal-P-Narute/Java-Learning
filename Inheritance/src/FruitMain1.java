 class FruitMain1 {
	 
	 public static void main(String[] args) {
		 Mango1 mango = new Mango1();
		 mango.name = "mango";
		 mango.color = "yellow";
		 mango.taste = "sweet";
		 mango.shape = "oval";
		 
		 System.out.println(mango.name);
		 System.out.println(mango.color);
		 System.out.println(mango.taste);
		 System.out.println(mango.shape);
		 
		 Fruit1 fruit = mango; // UPCASTING HAPPENS BECAUSE WE HAVE STORED CHILD CLASS OBJECT INSIDET THE PARENT
		                       // CLASS OBJECT REFERENCE VARIABLE
		 System.out.println(fruit.name);
		 System.out.println(fruit.color);
		 System.out.println(fruit.taste);
		 System.out.println(fruit.shape); // this gets compile time error because in upcasting we cannot access the
		                                  // properties of child class
		 
	 }

}
