package com.cybertek.lambda.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberList {
    public static void main(String[] args) {

        // List- Duplicates are allowed and insertion order
        // Set-insertion order not preserved duplicates not allowed
        List<Integer> list = new ArrayList<>();
        list.add(5);          list.add(15); list.add(25);          list.add(500); list.add(55);          list.add(56);
        System.out.println(list);
        // To Sort ascending
        Collections.sort(list);
        System.out.println(list);
        // To Sort descending

        Collections.sort(list,new MyComparator());
        System.out.println(list);


        //With Lambda Assending order
        Collections.sort(list);
        System.out.println(list);
        // With Lambda Descending order
        Collections.sort(list,((o1, o2)->(o1>o2)?-1: (o2>o1)?1:0));
        System.out.println(list);

        //Ascending Order
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list);

        //Descending order
        list.sort(((o1, o2) -> o2.compareTo(o1)));
        System.out.println(list);

        list.sort(((o2, o1) -> o1.compareTo(o2)));
        System.out.println(list);

    }


}
