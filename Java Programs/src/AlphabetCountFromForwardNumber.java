public class AlphabetCountFromForwardNumber {
    public static void main(String[] args) {

        String str = "w4e2d1r1x5";
        String str1 = "";

//        int count = 0;
        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)>='1' && str.charAt(i) <='9')
//            or
            if( !(str.charAt(i)>='a' && str.charAt(i) <='z')){

                int count = str.charAt(i) - 48;

                while(count>=1){
                    str1 += str.charAt(i-1);
                    count--;

                }
            }

        }
        System.out.print(str1);
    }
}
