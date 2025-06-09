package com.java.methodAndConstructorReferences;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        ConvertToUpperCase convertToUpperCase = (str) -> {
           return str.toUpperCase();
        };
        System.out.println(convertToUpperCase.toUpperCase("Prajwal Narute"));



        // Method Reference is A Special Type Of Lambda Expression

//        :: = Method reference Delimiter

        // by using method reference we reduce code

//       IMP :- def = Re-using / executing a pre-defined method from string class
 //      assigning that reference of class

        // 4 Types:
//        1. Reference to Static Methods
//        2. Reference to instance Methods
//        3. Reference to instance Method of arbitary object of Given Type
//        4. Reference to Constructor

        ConvertToUpperCase convertToUpperCase1 = String::toUpperCase;
        System.out.println(convertToUpperCase1.toUpperCase("Prajwal Narute"));

//        1. Reference to static Method


        Employee emp = new Employee();

        // here we are reusing predefined method of Employee class
        // for reference to static method
        // ClassName :: MethodPresentInside class
//        EmployeeValidation employeeValidation = Employee::validateEmployeeDetails;
//
//        System.out.println(employeeValidation.isValidEmployee(emp)); // false because id and name is null
//
//        emp.setName("Prajwal");
//        emp.setId(100);
//        System.out.println(employeeValidation.isValidEmployee(emp)); // true because id and name is present

//        2. Reference to instance method

//        instanceReference :: MethodName
        // here we have to create instance of the class in which method is present
        Employee emp2= new Employee();

        EmployeeValidation employeeValidation1 = emp2::validateEmployeeDetails;
        System.out.println(employeeValidation1.isValidEmployee(emp2));

        emp2.setId(101);
        emp2.setName("Narute");
        System.out.println(employeeValidation1.isValidEmployee(emp2));

//        we can create "reference to instance method" by using also
//         className::methodName
        // but the signature of methodreferenced method and abstract method of interface should be same(means return type)
//         and methodreference method does not accept parameter must.

//        Ex.
      Employee emp3 = new Employee();
      emp3.setSalary(30000);

      EmployeeValidation employeeValidation2 = Employee::validateSalary;
        System.out.println(employeeValidation2.isValidEmployee(emp3));

        //Reference to constructor
//        ClassName :: new

//         Make sure abstract method of interface's parameters are part of constructor Definition with
//        respect to order and type and numbeer of parameter also.

        DetailsOfEmployee detailsOfEmployee = Employee::new;

      Employee employee4 =  detailsOfEmployee.getDetails(100, "Prajwal Narute");
        System.out.println(employee4.getId());
        System.out.println(employee4.getName());






    }
}
