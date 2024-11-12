import java.util.ArrayList;
import java.util.Collections;

class ComparatorInterface {
         public static void main(String[] args) {
        	 ArrayList <Employee2> e = new ArrayList<Employee2>();
             
             e.add(new Employee2(123, "arjun", 50000));
             e.add(new Employee2(124, "krishna", 60000));
             e.add(new Employee2(121, "karna", 55000));
             e.add(new Employee2(120, "bheem", 52000));	
             
             System.out.println(e);
             Collections.sort(e, new IdSorting());
             System.out.println(e);
             
             Collections.sort(e, new SalarySorting());
             System.out.println(e);
         }
}
