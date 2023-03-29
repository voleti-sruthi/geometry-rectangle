package com.m2pfintech;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.m2pfintech.GeometryRectangle.createSquare;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeometryRectangleTest {

    @Nested
    class Rectangle {
        @Nested
        class RectangleArea {
            @Test
            void toReturnAreaAsEightWhenSidesAreTwoAndFour() {
                GeometryRectangle rectangleObject = new GeometryRectangle(2,4);
                double expectedArea = 8;

                double actualArea = rectangleObject.rectangleArea();

                assertEquals(expectedArea, actualArea);
            }

            @Test
            void toReturnAreaAsEightPointFourWhenSidesAreTwoPointOneAndFour() {
                GeometryRectangle rectangleObject = new GeometryRectangle(2.1,4);
                double expectedArea = 8.4;

                double actualArea = rectangleObject.rectangleArea();

                assertEquals(expectedArea, actualArea);
            }

            @Test
            void toThrowInvalidInputExceptionIfSidesAreNegativeValues() {
                GeometryRectangle rectangleObject = new GeometryRectangle(-2,4);

                assertThrows(IllegalArgumentException.class, rectangleObject::rectangleArea);

            }


        }

        @Nested
        class RectanglePerimeter {
            @Test
            void toReturnPerimeterAsSixteenWhenSidesAreTwoAndSix() {
                GeometryRectangle rectangleObject = new GeometryRectangle(2,6);
                double expectedPerimeter = 16;

                double actualPerimeter = rectangleObject.rectanglePerimeter();

                assertEquals(expectedPerimeter, actualPerimeter);
            }

            @Test
            void toReturnPerimeterAsSixteenPointFourWhenSidesAreTwoPointTwoAndSix() {
                GeometryRectangle rectangleObject = new GeometryRectangle(2.2,6);
                double expectedPerimeter = 16.4;

                double actualPerimeter = rectangleObject.rectanglePerimeter();

                assertEquals(expectedPerimeter, actualPerimeter);
            }

            @Test
            void toThrowInvalidInputExceptionIfSidesAreNegativeValues() {
                GeometryRectangle rectangleObject = new GeometryRectangle(-2,4);
                assertThrows(IllegalArgumentException.class, rectangleObject::rectanglePerimeter);
            }
        }
    }

    @Nested
    class Square {
        @Nested
        class SquareArea {
            @Test
            void toReturnAreaAsTwentyFiveWhenSideOfSquareIsFive() {
                GeometryRectangle squareObject = createSquare(5);
                double expectedArea = 25;

                double actualArea = squareObject.rectangleArea();


                assertEquals(expectedArea, actualArea);
            }
            @Test
            void toReturnAreaAsFourPointFourOneWhenSideOfSquareIsTwoPointOne() {
                GeometryRectangle squareObject = createSquare(2.1);
                double expectedArea = 4.41;

                double actualArea = squareObject.rectangleArea();

                assertEquals(expectedArea, actualArea);
            }


            @Test
            void toThrowInvalidInputExceptionIfSidesAreNegativeValues() {
                GeometryRectangle squareObject = createSquare(-5);

                assertThrows(IllegalArgumentException.class, squareObject::rectangleArea);

            }


        }

        @Nested
        class SquarePerimeter {
            @Test
            void toReturnPerimeterAsSixteenWhenSideOfSquareIsFour() {
                GeometryRectangle squareObject = createSquare(4);
                double expectedPerimeter = 16;

                double actualPerimeter = squareObject.rectanglePerimeter();

                assertEquals(expectedPerimeter, actualPerimeter);
            }

            @Test
            void toReturnPerimeterAsSixteenPointFourWhenSideOfSquareIsFourPointOne() {
                GeometryRectangle squareObject = createSquare(4.1);
                double expectedPerimeter = 16.4;

                double actualPerimeter = squareObject.rectanglePerimeter();

                assertEquals(expectedPerimeter, actualPerimeter);
            }

            @Test
            void toThrowInvalidInputExceptionIfSideIsNegativeValues() {
                GeometryRectangle squareObject = createSquare(-2);
                assertThrows(IllegalArgumentException.class, squareObject::rectanglePerimeter);
            }
        }
    }

}
