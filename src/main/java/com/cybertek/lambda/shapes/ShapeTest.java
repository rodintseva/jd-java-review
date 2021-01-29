package com.cybertek.lambda.shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Drawable drawable = ()-> System.out.println("Drawing a circle");

        drawable.draw();
        drawable.draw();

        Drawable2 drawable2=shape -> System.out.println("Drawing a "+shape);
        drawable2.draw("Triangle");

        Drawable3 drawable3 =(shape, name) -> System.out.println(name +"is drawing "+ shape);
        drawable3.draw("Circle","Mike");
        Drawable4 drawable4 =(shape, name,area) -> "Drawing a" +shape +" and his name is " + name + " on the window ";
        drawable4.draw("Circle","Mike","Window");

        Drawable3 drawable31 = (shape, name) -> {
            System.out.println("What kind of shape is this? " + shape);
            System.out.println("Who is drawing the shape? "+name);
            System.out.println("What is this ? ");
        };
        drawable31.draw("Quadratangle","Cecil");
    }
}
