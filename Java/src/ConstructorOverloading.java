 
// This program give correct output in CMD but in eclipse it shows error

class Student2 {
	
	public int id;
	public String name;
	public long mob;
	public String email;
	public int age;
	
	public Student2(int id, String name, int age) {
		 
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Student2(int id, int age) {
		 
		this.id = id;
		this.age = age;
	}
	public Student2(String email) {
		this.email = email;
	}
	
	public void print() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.mob);
		System.out.println(this.email);
		System.out.println(this.age);
		
	}
	
     public static void main(String[] args) {
    	 
    	 Student2 obj1 = new Student2(2,  34);
    	 obj1.print();
    	 
     }
}
