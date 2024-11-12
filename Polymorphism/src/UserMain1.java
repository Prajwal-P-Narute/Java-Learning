
class UserMain1 {
       public static void main(String[] ar) {
    	   User1 user1 = new User1("prajwal@gmail.com", "Prajwal@123");
    	   
    	   User1 user2 = new User1(8007808213l, "Prajwalnarute@123");
    	   
    	   User1 user3 = new User1(); // the default constructor is not present in user1 class so we
    	                             // have to create default constructor inside the User1 class
    	   
    	   user3.logIn("prajwal@gmail.com", "Prajwal@123");
    	   user3.logIn(8007808213l, "Prajwalnarute@123");
    	   
    	   user1.print();
    	   user2.print();
    	   
    	   
       }
}
