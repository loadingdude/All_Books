package com.cc.secondApp;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Karthik on 7/1/2017.
 */
public class SecondApp {

    static int firstNum = 0;
    static int secondNum = 0;
    static int result = 0;

    /**
     * This will accept two number and store them for later use
     */
    @Given("^two numbers (\\d+) and (\\d+)$")
    public void two_numbers_and(int arg1, int arg2) throws Throwable {
        firstNum = arg1;
        secondNum = arg2;
    }


    @When("^adding up the numbers$")
    public void adding_up_the_numbers() throws Throwable {
        result = firstNum + secondNum;
    }

    @Then("^the result should yield (\\d+)$")
    public void the_result_should_yield(int sum) throws Throwable {
        Assert.assertEquals("Both of them are not equal... ", result, sum);
    }

}
