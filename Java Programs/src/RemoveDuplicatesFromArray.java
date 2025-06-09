import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 3, 6, 8, 5 };


        //BY USING COLLECTION
        // order is not preserving
//        HashSet<Integer> set = new HashSet<>();

        // here order is preserving
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//
//
//        for(int num:arr){
//            set.add(num);
//        }
//        System.out.println(set);
//

        // WITHOUT COLLECTION

        int[] arr2 = new int[arr.length];

        int newLength = 0;

        for(int i=0;i<arr.length;i++){

            boolean isDuplicate = false;

            for(int j=0;j<newLength;j++){
                if(arr[i] == arr2[j]){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                arr2[newLength++] = arr[i];
            }
        }


        int[] finalArr = new int[newLength];
       for(int i=0;i<newLength;i++){
           finalArr[i] = arr2[i];
       }

        System.out.println(Arrays.toString(finalArr));
    }
}
