//import java.util.*;

import java.util.Comparator;

class Employee2 {
	int id;
    String name;
    double salary;
    
    public Employee2(int id, String name, double salary) {
    	this.id =  id;
    	this.name = name;
    	this.salary = salary;
    	
    }
    
    public String toString() {
    	return "id= "+id+" name= "+name+" salary= "+salary;
    }
}

class IdSorting implements Comparator <Employee2>{
	
	public int compare(Employee2 s1, Employee2 s2) {
		if(s1.id>s2.id)
			return 1;
		else if(s1.id<s2.id)
			return -1;
		else
			return 0;
	}
}

class SalarySorting implements Comparator <Employee2>{
	public int compare(Employee2 e1, Employee2 e2) {
		if(e1.salary>e2.salary)
			return 1;
		else if(e1.salary<e2.salary)
			return -1;
		else
			return 0;
	}
}
