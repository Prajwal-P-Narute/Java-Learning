 class Employee {
     private String ename;
     private int eid;
     double sal;
     
     public void setEname(String ename) {
    	 this.ename = ename;
     }
     
     public String getEname() {
    	 return this.ename;
     }
     
     public void setId(int eid) {
    	 this.eid = eid;
     }
     public int getId() {
    	 return this.eid;
     }
     
     public Employee(String ename, int eid, double sal) {
    	 this.ename  = ename;
    	 this.eid = eid;
    	 this.sal = sal;
     }
     
     public void print() {
    	 System.out.println(this.ename);
    	 System.out.println(this.eid);
    	 System.out.println(this.sal);
     }
}
