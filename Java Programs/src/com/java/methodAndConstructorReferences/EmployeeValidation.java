package com.java.methodAndConstructorReferences;

@FunctionalInterface
public interface EmployeeValidation {

    // Taking in emp details and checking id, name : true or false
    boolean isValidEmployee(Employee emp);
}
