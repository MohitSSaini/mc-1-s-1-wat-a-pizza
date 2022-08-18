package com.jap.pizzaorder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PizzaOrderTest {
    PizzaOrder pizzaOrder = null;
    
    @Before
    public void setUp ( ) {
        //Initialize the object of class PizzaOrder
        pizzaOrder = new PizzaOrder ( );
    }
    
    @After
    public void tearDown ( ) {
        // Assign object of PizzaOrder to null
        pizzaOrder = null;
    }
    
    // Write th logic inside the test case methods
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceSuccess ( ) {
        int noOfPizza = 5;
        float priceOfPizza = 12.99f;
        //act
        float expectedOutPut = 64.95f;
        float actualOutPut = pizzaOrder.calculatePriceOfPizza(noOfPizza, priceOfPizza);
    
        //assert
        Assertions.assertEquals(expectedOutPut, actualOutPut);
    
    }
    
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceSuccess ( ) {
        int noOfGarlicBread = 3;
        float priceOfGarlicBread = 5.99f;
        //act
        float expectedOutPut = 17.97f;
        float actualOutPut = pizzaOrder.calculatePriceOfGarlicBread ( noOfGarlicBread , priceOfGarlicBread );
        //assert
        Assertions.assertEquals ( expectedOutPut , actualOutPut );
    
    
    }
    
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceSuccess ( ) {
    
    }
    
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure ( ) {
    
    }
    
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure ( ) {
    
    }
    
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceFailure ( ) {
    
    }
    
    @Test
    public void givenSizeofPizzaReturnPrice ( ) {
    
    
    }
    
    @Test
    public void givenPriceOfItemsCalculateTotalBillAmount ( ) {
    
    }
    
    @Test
    public void givenTotalBillAmountGreaterThan50CalculateDiscount ( ) {
    
    
    }
    
    @Test
    public void givenTotalBillLessThan50AmountCalculateDiscount ( ) {
    
    
    }
}
