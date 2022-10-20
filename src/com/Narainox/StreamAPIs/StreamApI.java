package com.Narainox.StreamAPIs;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
/*
Stream ApI-
*Stream is new concept in java 8 which provides us to process the huge amount of data.
*It has lots of method
*It has Parallel stream feature
* In stream we are process the stream of data.
 */

public class StreamApI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 123, 45, 34);
        /*
        If we want to print the List than we are using the two ways One is For and Second one is enhanced
        for loop and also Print the value with Internal iterations.
         */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer i : list) {
            System.out.println(i);
        }

        //here we are using foreach method
        list.forEach(e -> System.out.println(e));
        // Pass By method reference
        list.forEach(System.out::println);


        //In stream we have two types of method
        /*
        we have Intermediate->
        *filter
        *map
        Terminate->
        *foreach()
        *findFirst()
         */
        list.stream().forEach(System.out::println);


        //we can use Streams only once a time not multiple time.
        Stream<Integer> st = list.stream();
        st.forEach(System.out::println);
        st.forEach(System.out::println);
    }
}