import java.util.Arrays;

class AnagramString {
    public static void main(String [] args) {
    	
    	System.out.println(anagramString("silent", "listen"));
    	System.out.println(anagramString("god", "Dog"));
    	System.out.println(anagramString("act", "CAT"));
    	System.out.println(anagramString("silent", "li s  te  n"));
    	System.out.println(anagramString("joy", "enjoy"));
    	System.out.println(anagramString("eLVis", "LiveS"));
    	System.out.println(anagramString("shot", "Toss"));
    	
    }
    
    public static boolean anagramString(String s1, String s2) {
    	
    	String str1 = s1.replaceAll(" ", "");
    	String str2 = s2.replaceAll(" ", "");
    	
    	if(str1.length() != str2.length()) {
    		return false;
    	}
    	else {
    		char[] c1 = str1.toLowerCase().toCharArray();
    		char[] c2 = str2.toLowerCase().toCharArray();
    		
    		Arrays.sort(c1);
    		Arrays.sort(c2);
    		
    		return Arrays.equals(c1, c2);
    	}
    }
}
