package com.at.internship.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.math.BigDecimal;

public class MathUtilsTest {
    private MathUtils mathUtils;

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before each test");
        mathUtils = new MathUtils();
    }

    // Hypotenuse tests begin
    @Test
    public void testHypotenuseHappyPath(){
        BigDecimal hypotenuse = mathUtils.hypotenuse(new BigDecimal("4.0"), new BigDecimal("3.0"));
        Assertions.assertNotNull(hypotenuse);
        Assertions.assertEquals(new BigDecimal("5.0"), hypotenuse);
    }

    @Test
    public void testHypotenuseProvidingHick1NullValue(){
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> mathUtils.validateHick(null, new BigDecimal("3.0")));
        Assertions.assertEquals("Hicks cannot be null", e.getMessage());
    }

    @Test
    public void testHypotenuseProvidingHick2NullValue(){
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> mathUtils.validateHick(new BigDecimal("4.0"), null));
        Assertions.assertEquals("Hicks cannot be null", e.getMessage());
    }

    @Test
    public void testHypotenuseProvidingHick1NegativeValue(){
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> mathUtils.validateHick(new BigDecimal("-4.0"), new BigDecimal("3.0")));
        Assertions.assertEquals("Hick value should be a positive number", e.getMessage());
    }

    @Test
    public void testHypotenuseProvidingHick2NegativeValue(){
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> mathUtils.validateHick(new BigDecimal("4.0"), new BigDecimal("-3.0")));
        Assertions.assertEquals("Hick value should be a positive number", e.getMessage());
    }


    // Distance tests begin
    @Test
    public void testDistanceHappyPathPositiveValues(){
        BigDecimal distance = mathUtils.distance(new Point(4,0), new Point(5,0));
        Assertions.assertNotNull(distance);
        Assertions.assertEquals(new BigDecimal("1.0"), distance);
    }

    @Test
    public void testDistanceProvidingPoint1NullValue(){
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> mathUtils.validatePoints(null, new Point(5,0)));
        Assertions.assertEquals("Point cannot be null", e.getMessage());
    }

    @Test
    public void testDistanceProvidingPoint2NullValue(){
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> mathUtils.validatePoints(new Point(5,0), null));
        Assertions.assertEquals("Point cannot be null", e.getMessage());
    }

    @Test
    public void testDistanceProvidingXNegativeValues(){
        BigDecimal distance = mathUtils.distance(new Point(-1,0), new Point(2,4));
        Assertions.assertNotNull(distance);
        Assertions.assertEquals(new BigDecimal("5.0"), distance);
    }

    @Test
    public void testDistanceProvidingYNegativeValues(){
        BigDecimal distance = mathUtils.distance(new Point(0,-1), new Point(3,3));
        Assertions.assertNotNull(distance);
        Assertions.assertEquals(new BigDecimal("5.0"), distance);
    }
}
