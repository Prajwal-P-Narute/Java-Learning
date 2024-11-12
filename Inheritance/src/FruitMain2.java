
 class FruitMain2 {
         public static void main(String[] args) {
        	 Mango1 mango = new Mango1();
    		 mango.name = "mango";
    		 mango.color = "yellow";
    		 mango.taste = "sweet";
    		 mango.shape = "oval";
    		 
    		 Fruit1 fruit2 = mango; //Up-casting
    		 
    		 mango = (Mango1)fruit2; //Down-casting. it is not directly performed by compiler implicitly but we have to perform
    		                         // it forcefully using 'type cast operator'
    		 System.out.println(mango.name);
    		 System.out.println(mango.color);
    		 System.out.println(mango.taste);
    		 System.out.println(mango.shape); // in order to access specific child class properties we have to perform down-casting.
    		 
        }
}
