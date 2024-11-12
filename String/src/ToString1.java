
 class ToString1 {
	 String brand;
	 
	 ToString1(String brand){
		 this.brand = brand;
	 }
	 
	 public String toString() {
		 return "brand is " + this.brand;
	 }
	 
	 public static void main(String[] args) {
		 ToString1 b = new ToString1("Thar");
		 
		 System.out.println(b);
		 
		 
		 // Upcasting
		 Object o = b;
		 System.out.println(o);
	 }

}
