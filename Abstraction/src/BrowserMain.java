
 class BrowserMain {
	 public static void main(String [] args) {
     Browser browser1 = new Chrome();
     browser1.openLink("www.google.com");
     
     Browser browser2 = new Safari();
     browser1.openLink("www.google.com");
     
     Browser browser3 = new Edge();
     browser1.openLink("www.google.com");
}
}
