package com.cybertek.stream;

import com.cybertek.collections.ArrayListss;
import com.cybertek.oop.encapsulation.Role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
        //Creating stream from Array
        String [] courses = {"Java", "JS", "TS", "API","Selenium"};
        Stream <String> courseStream = Arrays.stream(courses);
        // Creating Stream From Collection
        Stream<Role> roleStream = ArrayListss.createRoleList().stream();
        //Creating a stream from Specified Values
        Stream <Integer> stream = Stream.of(1,2,3,4,5,6,7);

    }
}
