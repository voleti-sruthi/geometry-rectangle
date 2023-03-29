package com.m2pfintech;


public class GeometryRectangle {
    public double rectangleArea(double firstSide , double secondSide) throws IllegalArgumentException {
        if(firstSide <=0 || secondSide <= 0){
            throw new IllegalArgumentException();
        }
        return firstSide*secondSide;
    }

    public double rectanglePerimeter(double firstSide, double secondSide) {
        if(firstSide <=0 || secondSide <= 0){
            throw new IllegalArgumentException();
        }
        return 2*(firstSide+secondSide);
    }
}
