
interface P {
	
	int a = 10; // here compiler will add automatically access specifier as 'public'
	            // and access modifier as static 
	            // and variable type final
	public static void method1() {
		System.out.println("Hello from method1()");
	}
	abstract public void method2();

}
