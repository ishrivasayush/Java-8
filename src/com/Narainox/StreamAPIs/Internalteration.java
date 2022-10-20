package com.Narainox.StreamAPIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Internalteration {

    /*
    InterFace Type->
    There are Three Type of interface
    1)maker----contains zero method
    2)functional(SAM-Single Abstract Method Interface)----contains one method
    3)normal -----contains multiple methods
    Before Java 8 We are working with Object Oriented Programming where we do all the
    things like what to do and how to do.
    Java 8
    -In Java 8 We are just Focusing on what to do not how to do.
    -remaining work is done by Stream API.
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);

        /*
        -External Iterations-> fetching the Data from outside of the object
        -Internal Iteration-> fetching the Data from inside the object (object has a increment method). get with StreamApI



        Its print the Values start to end
        for (Integer i:list) {
        System.out.print(i+" ");
        }


       Iterator<Integer> i= list.iterator();
       while (i.hasNext())
       {
            System.out.println(i.next());
       }

       Its print the values from 2 to last

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }



        list.forEach(i->{ System.out.println(i);});

        // It is a functionalInterface Which consists only one method
        After 1.8 we cant write the boiler plate code that's here we just need the object of consumer interface so we just
        write the Lambda expression.

        Consumer<Integer> consumer=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        list1.forEach(consumer);

         */

        Consumer<Integer> consumer= (integer)-> System.out.print(integer);
        list1.forEach(consumer);                                             //Internal Iteration


    }
}

