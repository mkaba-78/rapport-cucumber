package com.canal.rapport;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RapportTest {
    Rapport fB;

    @Before
    public void setUp() {
        fB= new Rapport();
    }

    @Test
    public void testNumber() {
        String fizzBuzz=fB.play(1);
        Assert.assertEquals(fizzBuzz, "1");
    }

    @Test
    public void testFizz() {
        String fizzBuzz=fB.play(3);
        Assert.assertEquals(fizzBuzz, "Fizz");
    }

    @Test
    public void testBuzz() {
        String fizzBuzz=fB.play(5);
        Assert.assertEquals(fizzBuzz, "Buzz");
    }


    @Test
    public void testFizzBuzz() {
        String fizzBuzz=fB.play(15);
        Assert.assertEquals(fizzBuzz, "FizzBuzz");
    }

    @After
    public void tearDown() {
        fB=null;
    }
}
