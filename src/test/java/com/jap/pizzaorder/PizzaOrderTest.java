package com.jap.pizzaorder;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzaOrderTest {
    PizzaOrder pizzaOrder = null;
    
    @BeforeEach
    public void setUp ( ) {
        //Initialize the object of class PizzaOrder
        pizzaOrder = new PizzaOrder ( );
    }
    
    @AfterEach
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
        float actualOutPut = pizzaOrder.calculatePriceOfPizza ( noOfPizza , priceOfPizza );
        //assert
        Assertions.assertEquals ( expectedOutPut , actualOutPut );
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
        //arrange
        int noOfBeverages = 5;
        float priceOfBeverages = 1.99f;
        //act
        float expectedOutPut = 9.95f;
        float actualOutPut = pizzaOrder.calculatePriceOfBeverage ( noOfBeverages , priceOfBeverages );
        //assert
        Assertions.assertEquals ( expectedOutPut , actualOutPut );
    }
    
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure ( ) {
        //arrange
        int noOfPizza = 5;
        float priceOfPizza = 12.99f;
        //act
        float expectedOutPut = 64.95f;
        float actualOutPut = pizzaOrder.calculatePriceOfPizza ( noOfPizza , priceOfPizza );
        //assert
        Assertions.assertEquals ( expectedOutPut , actualOutPut );
    
    }
    
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure ( ) {
        //arrange
        int noOfGarlicBread = 2;
        float priceOfGarlicBread = 5.99f;
        //act
        float expectedOutPut = 11.98f;
        float actualOutPut = pizzaOrder.calculatePriceOfGarlicBread ( noOfGarlicBread , priceOfGarlicBread );
        //assert
        Assertions.assertEquals ( expectedOutPut , actualOutPut );
    
    }
    
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceFailure ( ) {
        //arrange
        int noOfBeverages = 6;
        float priceOfBeverages = 1.99f;
        //act
        float expectedOutPut = 11.94f;
        float actualOutPut = pizzaOrder.calculatePriceOfBeverage ( noOfBeverages , priceOfBeverages );
        //assert
        Assertions.assertEquals ( expectedOutPut , actualOutPut , 0.01 );
    
    }
    
    @Test
    public void givenSizeofPizzaReturnPrice ( ) {
        float actualOutput = pizzaOrder.getPriceOfPizzaBasedOnSize ( 2 );
        Assertions.assertEquals ( 11.99f , actualOutput , "There is some error in the logic" );
    
    }
    
    @Test
    public void givenPriceOfItemsCalculateTotalBillAmount ( ) {
        float actualOutput = pizzaOrder.calculateTotalBill ( 25.99f , 10.99f , 5.99f );
        Assertions.assertEquals ( 25.99f + 10.99f + 5.99f , actualOutput , "There is some error in the logic" );
    
    }
    
    @Test
    public void givenTotalBillAmountGreaterThan50CalculateDiscount ( ) {
        float actualOutput = pizzaOrder.calculateDiscountAndReturnBillAmount ( 51.99f );
        Assertions.assertEquals ( 51.99f - 51.99f * 0.1 , actualOutput , 0.001 , "There is some error in the logic" );
    
    }
    
    @Test
    public void givenTotalBillLessThan50AmountCalculateDiscount ( ) {
        float actualOutput = pizzaOrder.calculateDiscountAndReturnBillAmount ( 49.99f );
        Assertions.assertEquals ( 49.99f , actualOutput , 0.001 , "There is some error in the logic" );
    
    }
}
