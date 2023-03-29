package com.m2pfintech;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeometryRectangleTest {
    GeometryRectangle rectangleObject = new GeometryRectangle();
    @Nested
    class RectangleArea {
        @Test
        void toReturnAreaAsEightWhenSidesAreTwoAndFour() {
            double expectedArea = 8;

            double actualArea = rectangleObject.rectangleArea(2,4);

            assertEquals(expectedArea,actualArea);
        }

        @Test
        void toReturnAreaAsEightPointFourWhenSidesAreTwoPointOneAndFour()  {
            double expectedArea = 8.4;

            double actualArea = rectangleObject.rectangleArea(2.1,4);

            assertEquals(expectedArea,actualArea);
        }

        @Test
        void toThrowInvalidInputExceptionIfSidesAreNegativeValues() {

            assertThrows(IllegalArgumentException.class,() -> rectangleObject.rectangleArea(-2,4));

        }


    }

    @Nested
    class RectanglePerimeter{
        @Test
        void toReturnPerimeterAsSixteenWhenSidesAreTwoAndSix(){
            double expectedPerimeter = 16;

            double actualPerimeter = rectangleObject.rectanglePerimeter(2,6);

            assertEquals(expectedPerimeter,actualPerimeter);
        }

        @Test
        void toReturnPerimeterAsSixteenPointFourWhenSidesAreTwoPointTwoAndSix(){
            double expectedPerimeter = 16.4;

            double actualPerimeter = rectangleObject.rectanglePerimeter(2.2,6);

            assertEquals(expectedPerimeter,actualPerimeter);
        }

        @Test
        void toThrowInvalidInputExceptionIfSidesAreNegativeValues() {
            assertThrows(IllegalArgumentException.class, () -> rectangleObject.rectanglePerimeter(-2, 4));
        }
    }

}
