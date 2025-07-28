package com.java.comparableandcomparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();

        list1.add(2);
        list1.add(3);
        list1.add(1);
        list1.add(67);
        list1.add(23);
        list1.add(3);
        System.out.println(list1);
        list1.sort(null); // accepts Comparator interface type reference . if we pass null as parameter then
                             // it sort according natural order means ascending

        System.out.println(list1);

        List<Student> list2 = new ArrayList<>();

        list2.add(new Student(12, "Prajwal"));
        list2.add(new Student(8, "Onkar"));
        list2.add(new Student(67, "Aniket"));
        list2.add(new Student(56, "Yash"));
        list2.add(new Student(98, "Prajwal"));

//        list2.sort(new MyComparator());
//        Collections.sort(list2, new MyComparator());
//         the above two ways is similar we can use one of the two ways


//        also By using lambda expression we can implement Comparator interface because
//        Comparator is a Functional Interface which contains one Abstract method i.e compare();
//        list2.sort((s1, s2) ->{
//            if(s1.getId()<s2.getId()){
//                return 1;
//            } else if (s1.getId() > s2.getId()) {
//                return -1;
//            }else{
//                return 0;
//            }
//        });

//        System.out.println(list2);


        Comparator<Student> s = (s1, s2) ->{
            if(s1.getId()<s2.getId()){
                return 1;
            } else if (s1.getId() > s2.getId()) {
                return -1;
            }else{
                return 0;
            }
        };
//       Collections.sort(list2, s);

        list2.sort(s);
        System.out.println(list2);



    }


}
