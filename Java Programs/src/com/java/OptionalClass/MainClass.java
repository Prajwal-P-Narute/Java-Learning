package com.java.OptionalClass;

import java.util.Optional;

public class MainClass {


    public static void main(String[] args) {

        Optional<String> n2 = name();


        // isPresent()
//       if(n2.isPresent()){
//           System.out.println(n2.get()+" is present");
//       }
//
//       // isEmpty()
//       if(n2.isEmpty()){
//           System.out.println("Name is not there");


        // ifPresent() it accept consumer interface type functionality
        // if value is present then implemetn consumer interface with lambda
        n2.ifPresent(value -> System.out.println(value.toUpperCase()));

        n2.ifPresentOrElse(
                //ifPresent
                // 1st param : if value is present it implements consumer interface
                (value) ->{
                    System.out.println("Value present so convert it into upper case");
                    System.out.println(value.toUpperCase());
                },


                // 2nd param : Default logic
                // when value is not present then we have something to do then add to this block
                //orElse
        () ->{
            System.out.println("Value is not present so i am just returning default value");

        }
        );


       }





    public static Optional <String> name(){
       String n1 = null;

       Optional<String> value = null;


       if(n1 == null){
           value = Optional.empty();

       }else{
           value = Optional.of(n1);
       }
       return  value;
    }
}
