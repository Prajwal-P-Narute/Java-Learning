  // super keyword :- is used to access non-static properties of a parent class if the name 
// given to parent class property and the name given to child class property are same.
 class Y extends X {
    int a = 20;
    public void printProperties() {
    	System.out.println(this.a); // this access the value of a in same class
    	System.out.println(super.a); // this access the value of a in the parent class
    }
    
    public static void main(String[] args) {
    	Y y = new Y();
    	y.printProperties();
    }
}
