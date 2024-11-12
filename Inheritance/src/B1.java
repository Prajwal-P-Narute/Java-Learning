// Constructor chaining using Super call statement 

class B1 extends A1 {
      B1(){
    	super(100);
    	System.out.println("B1()");
      }
      B1(int a){
    	  super('a'); // here Widening is done to convert character to int
    	  System.out.println("B1(int)");
      }
      
      B1(char ch){
    	  super(133.133);
    	  System.out.println("B1(char)");
      }
      
      public static void main(String[] args	) {
    	  B1 obj1 = new B1();
    	  B1 obj2 = new B1(100);
    	  B1 obj3 = new B1('a');
      }
}
