
 class Car {
    public String name;
    public String brand;
    public double price;
    public String color;
    public int mileage;
    public int maxSpeed;
    
    public void run() {
    	System.out.println("The maximum speed of the car " + name +" is "+maxSpeed);
    }
    public static void main(String[] a) {
    	Car c = new Car();
    	c.name = "RangeRover";
    	c.maxSpeed = 100;
    	c.run();
    }
}
