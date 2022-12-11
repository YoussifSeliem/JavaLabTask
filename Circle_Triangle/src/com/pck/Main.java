package com.pck;

public class Main {
    public static void main(String[] args) {

        Circle c1=new Circle();
        Triangle t1=new Triangle();

        c1.setRadius(4.0);
        t1.setSides(4.0,3.0,5.0);

        System.out.println(c1.getCircumference());
        System.out.println(c1.getArea());

        System.out.println(t1.getCircumference());
        System.out.println(t1.getArea());

        System.out.println(c1.toString());
        System.out.println(t1.toString());

    }
}