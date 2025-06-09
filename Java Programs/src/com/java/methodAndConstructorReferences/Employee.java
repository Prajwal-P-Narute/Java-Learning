package com.java.methodAndConstructorReferences;

public class Employee {
    private int id;
    private String name;
    private String gender;
    private double salary;


    Employee(){
        System.out.println("this is no argument constructor");
    }

    Employee(int eid, String name){
        this.id = eid;
        this.name = name;
    }

    Employee(String gender){
        this.gender = gender;
    }

     boolean validateEmployeeDetails(Employee employee){
        // check if id and name should be present

        if(employee.getId() != 0 && employee.getName() != null)
            return true;
        return false;
    }

    boolean validateSalary(){
        return this.getSalary()> 20000;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
