
 class Pattern2 {
   public static void main(String[] args) {
	   int n=5;
	   
	   for(int i=1;i<=n;i++) {
		   for(int j=1;j<=n;j++) {
			   if(i+j<=n + 1) {
				   System.out.print("* ");
			   }else {
				   System.out.print(" ");
			   }
		   }
		   System.out.println();
	   }
	  
	    
	   for(int k=1;k<=n;k++) {
		   for(int l=1;l<=n;l++) {
			   if(k<=l) {
				   System.out.print("* ");
			   }
			   else {
				   System.out.print(" ");
			   }
		   }
		   System.out.println();
	   }
   }
}
