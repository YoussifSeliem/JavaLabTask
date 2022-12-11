package com.pck;

public class Circle {

    private double radius;

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius*radius*3.14;
    }

    public double getCircumference(){
        return radius*2*3.14;
    }

    public String toString(){
        return "Circle {" + "radius=" + radius +'}' ;
    }


}
