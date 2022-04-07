package com.company;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class TestLine {
    public static void main(String[] args){
        Line L1 = new Line(1,2,3,4);
        System.out.println(L1);
        Line L2 = new Line(new Point(5,6),new Point(7,8));
        System.out.println(L2);
        L1.setBegin(new Point(11,12));
        L1.setBegin(new Point(13,14));
        System.out.println("begin is :" + L1.getBegin());
        System.out.println("end is :" + L1.getEnd());;
        L1.setBeginX(21);
        L1.setBeginY(22);
        L1.setEndX(23);
        L1.setEndY(24);
        System.out.println("begin's x is:" + L1.getBeginX());
        System.out.println("begin's y is: " + L1.getBeginY());
        System.out.println("end's x is:" + L1.getEndX());
        System.out.println("end's y is:" + L1.getEndY());

        L1.setBeginXY(31,32);
        L1.setEndXY(33,34);
        System.out.println(L1);
        System.out.println("begin's x and y are:" + Arrays.toString(L1.getBeginXY()));
        System.out.println("end's x and y are:" + Arrays.toString(L1.getBeginXY()));
        System.out.println("length is : %.2f%n",L1.getLength());
    }
}
