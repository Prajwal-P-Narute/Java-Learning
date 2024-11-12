
class Unboxing1 {
     public static void main(String[] args) {
    	 Byte b = 10;
  	   Short s = 20;
  	   Integer i = 20;
  	   Long l = 50l;
  	   Float f = 25.5f;
  	   Double d = 35.8;
  	   Character ch = 'x';
  	   Boolean bl = false;
  	   
  	   
    	// UnBoxing
  	   
//  	   byte v1 = b.byteValue();
//  	   short v2 = s.shortValue();
//  	   int v3 = i.intValue();
//  	   long v4 = l.longValue();
//  	   float v5 = f.floatValue();
//  	   double v6 = d.doubleValue();
//  	   char v7 = ch.charValue();
//  	   boolean v8 = bl.booleanValue();
  	   
  	   
  	   // AutoUnBoxing
  	   
  	   byte v1 = b;
  	   short v2 = s;
  	   int v3 = i;
  	   long v4 = l;
  	   float v5 = f;
  	   double v6 = d;
  	   char v7 = ch;
  	   boolean v8 = bl;
  	   
     }
}
