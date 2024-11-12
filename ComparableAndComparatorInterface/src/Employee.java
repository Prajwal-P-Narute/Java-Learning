import java.util.*;
 class Employee implements Comparable <Employee> // this <Employee> is necessary to add to emplement comparable interface
 {
        int id;
        String name;
        double salary;
        
        public Employee(int id, String name, double salary) {
        	this.id =  id;
        	this.name = name;
        	this.salary = salary;
        	
        }
        
        public String toString() {
        	return "id= "+id+" name= "+name+" salary= "+salary;
        }

		
        // Comparable Interface is implemented by class Employee so it is necessary
        // that we must implement one abstract method from Comparable interface
        // and that abstract method is nothing but compareTo() method.
        
        
        // sorting the object based on id in ascending order
//		public int compareTo(Employee e) {
//			if(e.id>id)
//				return -1;
//			else if(e.id<id)
//				return 1;
//			else
//				return 0;
//		}
        
        
		// if you want descending order then 
		public int compareTo(Employee e) {
			if(e.id>id)
				return 1;
			else if(e.id<id)
				return -1;
			else
				return 0;
		}
		
		

}
