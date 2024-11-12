import java.util.Scanner;
 class Pattern1 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the number of rows");
//	  int n1 = sc.nextInt();
//	  
//	  for(int i=1;i<=n1;i++) {
//		  for(int j=1;j<=n1;j++) {
//			  System.out.print("* ");
//		  }
//		  System.out.println();
//	  }
	   
	   
//	   * * * * 
//	   * * * *
//	   * * * *
//	   * * * *
//	   
//	   int n2 = sc.nextInt();
//	   
//	   for(int i=1;i<=n2;i++) {
//		   for(int j=1;j<=n2;j++) {
//			   System.out.print(n2+" ");
//		   }
//		   System.out.println();	   

//	   }
//   4 4 4 4 
//   4 4 4 4 
//   4 4 4 4 
//   4 4 4 4
	   
	   
	   
	   int n3 = sc.nextInt();
	   int temp = 1;
	   
	   for(int i=1;i<=n3;i++) {
		   for(int j=1;j<=n3;j++) {
			   System.out.print(temp+" ");
		   }
		   temp++;
		   if(temp == n3 + 1)
			   break;
		  
		   System.out.println();	     
	   }
	   }
}
