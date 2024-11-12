import java.util.Scanner;
public class Ascii {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);  // imp- it is used to take character value as an input from user
        
        int val = ch;
        System.out.println(val);
        }
}
