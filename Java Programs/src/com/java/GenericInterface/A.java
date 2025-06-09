package com.java.GenericInterface;


//You can write a single interface that works with any type (Integer, String, Custom Objects, etc.)
//Code becomes cleaner and more readable.
//Easier to understand what type of data is being processed.
//Generics ensure that only specific types can be used.
//
//Errors are caught at compile time, reducing runtime exceptions.

// T means Type
interface A<T> {
    T m1();
}

// T means parameter type
// R means return type
interface  B<T, R>{
    R m1( T t);
}
