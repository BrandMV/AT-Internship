package com.at.internship.finance;

//*For Junit 5 version
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InvestmentTest {
    private Investment investment;

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before each-test");
        investment = new Investment(new BigDecimal("100.00"), new BigDecimal("0.10"));
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After each test");
    }

    @BeforeAll /*Before class*/
    public static void beforeAll(){
        System.out.println("Before all tests");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After all tests");

    }
    @Test
    public void testGetFinalCapital(){
        //*End of first year: 110
        //*End of second year: 121
        //*End of third year: 133.1
        Assertions.assertEquals(new BigDecimal("133.10"), investment.getFinalCapital(3).setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    public void testGetYield(){
        //*End of first year: 110
        //*End of second year: 121
        //*End of third year: 133.1
        Assertions.assertEquals(new BigDecimal("33.10"), investment.getYield(3).setScale(2, RoundingMode.HALF_UP));
    }
    @Test
    public void testValidatePeriodCountProvidingNegativeValue(){
        //*first argument class we expected to be throw, must be equals to the type
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class,
                () -> investment.validatePeriodCount(0)
                );
        //*Second parameter must match with the result of first parameter
        Assertions.assertEquals("The number of periods should be 1 at minimum", e.getMessage());
    }

    @Test
    @Disabled /* Disables a test so it wont be executed */
    public void testValidatePeriodCountProvidingPositiveValue(){
        //*first argument class we expected to be throw, must be equals to the type
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class,
                () -> investment.validatePeriodCount(5)
        );
        //*Second parameter must match with the result of first parameter

    }
}
