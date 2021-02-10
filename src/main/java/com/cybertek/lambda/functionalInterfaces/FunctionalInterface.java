package com.cybertek.lambda.functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {

        //Accepts a single parameter and returns a single value, one function methods apply()
        Function<Integer,Double> half= a -> a/2.0;
        System.out.println(half.apply(10));

        //Does not accepts any arguments and returns an object
        Supplier <Double> randomValue =() ->Math.random();
        System.out.println(randomValue.get());

        //Accept a single argument and does not return any result
        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(10);

        //Accepts a singlr argument and returns true or false
        Predicate<Integer> lesserThen =i ->(i<10);
        System.out.println(lesserThen.test(5));


    }



}
