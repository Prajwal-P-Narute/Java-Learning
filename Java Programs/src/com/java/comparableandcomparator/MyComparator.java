package com.java.comparableandcomparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {


    // Sorting based on  id's of Student based on natural order i.e ascending
//    ex. 1, 2 if 1<2 then 1 comes before 2.
//    ex. 3, 1 if 3>1 then 3 comes after 1.
//    ex. 3, 3 if 3==3 then it does not move remains in inserting order

//    @Override
//    public int compare(Student o1, Student o2) {
//        if(o1.getId() < o2.getId()){
//            return -1;
//        }else if(o1.getId()>o2.getId()){
//            return 1;
//        }else{
//            return 0;
//        }
//    }


//     it also Sorting based on  id's of Student based on natural order i.e ascending
//    @Override
//    public int compare(Student s1, Student s2){
//        if( s1.getId() < s2.getId()){
//            return s1.getId() - s2.getId(); // s1's id < s2's id then result of s1's id - s2's id becomes negative
////                                             and return negative value means s1 comes before s2
//        }else if(s1.getId() > s2.getId()){
//            return s1.getId() - s2.getId();// s1's id > s2's id then result of s1's id - s2's id becomes positive
////                                             and return positive value means s1 comes after s2
//        }else{
//            return 0;
//        }
//    }











// Sorting based on  id's of Student based on reverse natural order i.e Descending
//    ex. 1, 2 if 1<2 then 1 comes after 2.
//    ex. 3, 1 if 3>1 then 3 comes before 1.
//    ex. 3, 3 if 3==3 then it does not move remains in inserting order
//    @Override
//    public int compare(Student s1, Student s2) {
//        if(s1.getId() < s2.getId()){
//            return 1;
//        }else if(s1.getId() > s2.getId()){
//            return -1;
//        }else{
//            return 0;
//        }
//    }


    // Sorting based on  id's of Student based on reverse natural order i.e Descending
//@Override
//public int compare(Student s1, Student s2) {
//    if(s1.getId() < s2.getId()){
//        return s2.getId() - s1.getId();// s1's id < s2's id then result of s2's id - s1's id becomes positive
////                                          and return positive value means s1 comes after s2
//    }else if(s1.getId() > s2.getId()){
//        return s2.getId() - s1.getId();// s1's id > s2's id then result of s2's id - s1's id becomes negative
////                                          and return negative value means s1 comes before s2
//    }else{
//        return 0;
//    }
//}










//// Sorting based on length of name of Student based on reverse natural order i.e Descending
//
//
//    @Override
//    public int compare(Student s1, Student s2) {
//        if(s1.getName().length()<s2.getName().length()){
//            return 1;
//        }else if(s1.getName().length() > s2.getName().length()){
//            return -1;
//        }else {
//            return 0;
//        }
//    }



// Sorting based on length of name of Student based on natural order i.e Ascending


//@Override
//public int compare(Student s1, Student s2) {
//    if(s1.getName().length()<s2.getName().length()){
//        return -1;
//    }else if(s1.getName().length() > s2.getName().length()){
//        return 1;
//    }else {
//        return 0;
//    }
//}




// Sorting based on length of name of Student based on reverse natural order i.e Descending
//@Override
//public int compare(Student s1, Student s2) {
//    if(s1.getName().length()<s2.getName().length()){
//        return 1;
//    }else if(s1.getName().length() > s2.getName().length()){
//        return -1;
//    }else {
//        return 0;
//    }
//}


// Sorting based on length of name of Student based on reverse natural order i.e Descending
//    if names is duplicate then for that duplicate names sort by using id
//    means for duplicate names's id which is greater comes first
//    @Override
//    public int compare(Student s1, Student s2) {
//        if(s1.getName().length()<s2.getName().length()){
//            return 1;
//        }else if(s1.getName().length() > s2.getName().length()){
//            return -1;
//        }else {
//            return s2.getId() - s1.getId(); // means s1's id is 12 and s2's id is 98
                                              // s2'id - s1'id = positive
                                              // so positive means s1 comes after s2
//        }
//    }


    // Sorting based on length of name of Student based on natural order i.e Ascending
    //    if names is duplicate then for that duplicate names sort by using id
//    means for duplicate names's id which is smaller comes first
//    @Override
//    public int compare(Student s1, Student s2) {
//        if(s1.getName().length()<s2.getName().length()){
//            return -1;
//        }else if(s1.getName().length() > s2.getName().length()){
//            return 1;
//        }else {
//            return s1.getId() - s2.getId();// means s1's id is 12 and s2's id is 98
//                                              // s1'id - s2'id = negative
//                                              // so negative means s1 comes before s2
//        }
//    }





    // Sorting based on length of name of Student based on reverse natural order i.e Descending
//    if names is duplicate then for that duplicate names sort by using id
//    means for duplicate names's id which is greater comes first
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getName().length()<s2.getName().length()){
            return 1;
        }else if(s1.getName().length() > s2.getName().length()){
            return -1;
        }else {
            return s2.getId() - s1.getId();  // means s1's id is 12 and s2's id is 98
                                              // s2'id - s1'id = positive
                                             // so positive means s1 comes after s2
        }
    }

}
