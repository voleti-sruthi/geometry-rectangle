package com.m2pfintech;


public class GeometryRectangle {
    private final double firstSide;
    private final double secondSide;
    public GeometryRectangle(double firstSide,double secondSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }
    public static GeometryRectangle createSquare(double side){

        return new GeometryRectangle(side,side);
    }
    public double rectangleArea() throws IllegalArgumentException {
        if(firstSide <=0 || secondSide <= 0){
            throw new IllegalArgumentException();
        }
        return firstSide*secondSide;
    }

    public double rectanglePerimeter() {
        if(firstSide <=0 || secondSide <= 0){
            throw new IllegalArgumentException();
        }
        return 2*(firstSide+secondSide);
    }

}
