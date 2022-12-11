package com.pck;

import java.util.Arrays;

public class Triangle {

    private double first;
    private double second;
    private double third;

    public void setSides(double s1,double s2, double s3){
        double []arr=new double[3];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        Arrays.sort(arr);
        if(s1>=(s2+s3)) {
            System.out.println("invalid values for the triangle");
            return;
        }
        first=s1;
        second=s2;
        third=s3;
    }

    public double getCircumference(){
        return first+second+third;
    }

    public double getArea(){
        double s=getCircumference()/2;
        return Math.sqrt(s*(s-first)*(s-second)*(s-third));
    }

    public String toString(){
        return "Triangle {" + "sides=" + first + ", " + second + ", " + third + '}' ;
    }

}
