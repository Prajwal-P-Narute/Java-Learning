public class AdjacentCharacter {

    public static void main(String[] args) {
        String str = "Javland";
        char[] str1 = str.toCharArray();

        if(str.length() % 2 == 0) {


            for(int i = 0;i<str.length();i = i+2) {
                char ch = '0';

                ch = str1[i];
                str1[i] = str1[i + 1];
                str1[i + 1] = ch;

            }

        }
        for(int i =0;i<str1.length;i++) {
            System.out.print(str1[i]);
        }




        System.out.println();

        String str2 = "nayana";
        String temp = "";

        for(int i=0, j = 1; i<str.length() && j<str.length(); i+=2, j+=2) {
            temp += str.charAt(j);
            temp += str.charAt(i);
        }

        if(str2.length() % 2 != 0) {
            temp += str.charAt(str.length() - 1);
        }
        System.out.println(temp);
    }
}
