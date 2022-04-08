package com.at.internship.math;

import java.awt.*;
import java.math.BigDecimal;

public class MathUtils {

    /**
     * Calculates the hypotenuse of a right triangle based on provided hicks
     * @param hick1 a hick
     * @param hick2 another hick
     * @return Hypotenuse value
     */
    public BigDecimal hypotenuse(BigDecimal hick1, BigDecimal hick2) {
        // Values cannot be null
        // Values should be greater than 0;
        // Values ar casting to double to use Math
        // ValueOf recieves a double and returns instance of BigDecimal

        validateHick(hick1, hick2);
        return BigDecimal.valueOf(Math.hypot(hick1.doubleValue(), hick2.doubleValue()));
    }

    /**
     * Calculates the distance between the points "a" and "b"
     * @param a initial point
     * @param b ending point
     * @return The distance between points "a" and "b"
     */
    public BigDecimal distance(Point a, Point b) {
        // Points cannot be null
        // Coordinates x and y can be positive or negative
        return BigDecimal.valueOf(a.distance(b));
    }

    /**
     * Validates hicks
     * @param h1 hick number 1
     * @param h2 hick number 2
     */
    void validateHick(BigDecimal h1, BigDecimal h2){
        if(h1 == null || h2 == null) throw new IllegalArgumentException("Hicks cannot be null");
        if((BigDecimal.ZERO.compareTo(h1) > 0) || (BigDecimal.ZERO.compareTo(h2) > 0)) throw new IllegalArgumentException(("Hick value should be a positive number"));
    }

    /**
     * Validates points
     * @param a Point number 1
     * @param b Point number 2
     */
    void validatePoints(Point a, Point b){
        if(a == null || b == null ) throw new IllegalArgumentException("Point cannot be null");
    }

}
