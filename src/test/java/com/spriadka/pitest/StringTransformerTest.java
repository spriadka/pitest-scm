package com.spriadka.pitest;


import org.junit.Assert;
import org.junit.Test;

public class StringTransformerTest {

    @Test
    public void testTransformToUpperCase(){
        String lower = "Hello World";
        StringTransformer operator = new UpperCaseTransformer();
        Assert.assertEquals(lower.toUpperCase(), operator.transform(lower));
    }

    @Test
    public void testTransformToLowerCase() {
        String upper = "DONALD TRUMP";
        StringTransformer operator = new LowerCaseTransformer();
        Assert.assertEquals(upper.toLowerCase(), operator.transform(upper));
    }

}
