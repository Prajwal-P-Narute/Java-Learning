import java.util.*;
class ComparableInterface {
	public static void main(String [] args) {
      ArrayList <Employee> e = new ArrayList<Employee>();
      
      e.add(new Employee(123, "arjun", 50000));
      e.add(new Employee(124, "krishna", 60000));
      e.add(new Employee(121, "karna", 55000));
      e.add(new Employee(120, "bheem", 52000));	
      
      System.out.println(e);
      //Collections.sort(e); // error because  compiler gets confuse on the what basis we can sort the objects of given ArrayList
      Collections.sort(e);
      System.out.println(e);
      
}
}
