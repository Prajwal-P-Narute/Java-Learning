
public class Product {
         public String title;
         public int id;
         public String desc;
         public int price;
         public boolean sold;
         public Product(String title, int id, String desc, int price, boolean sold) {
        	 this.title = title;
        	 this.id = id;
        	 this.desc = desc;
        	 this.price=  price;
        	 this.sold = sold;
         }
         
         public void print()
         {
        	 System.out.println(this.title);
        	 System.out.println(this.id);
        	 System.out.println(this.desc);
        	 System.out.println(this.price);
        	 System.out.println(this.sold);
         }
         
         
         public static void main(String[] args) {
        	 
        	 Product obj1 = new Product("Marker", 1, "for writing", 60, true );
        	 obj1.print();
        	 Product obj2 = new Product("Fan", 2, "for air cooling", 1500, false );
        	 obj2.print();
        	 Product obj3 = new Product("Laptop", 3, "for Coding", 40000, true );
        	 obj3.print();
         }
}
