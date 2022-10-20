package com.Narainox.StreamAPIs;

import java.util.Arrays;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
//        list.forEach(e-> System.out.println(e));
        //call By Reference
        //call By value
        //call By method Reference
        //ForEachMethod with method Reference
        list.forEach(System.out::println); //System.out.println(i);
        list.forEach(forEach::doubleValue);


    }
    public static void doubleValue(int i)
    {
        System.out.println(i*2);
    }
}
