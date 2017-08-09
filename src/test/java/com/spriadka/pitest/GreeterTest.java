package com.spriadka.pitest;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.junit.Assert;
import org.junit.Test;

import java.io.PrintStream;

public class GreeterTest {

    private Greeter greeter;

    private static final String SEPARATOR = System.getProperty("line.separator");

    @Test
    public void test(){
        final String name = "Simon Priadka";
        greeter = new Greeter(name);
        ByteOutputStream outputStream = new ByteOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        greeter.sayHello(stream);
        Assert.assertEquals(name + SEPARATOR,outputStream.toString());
    }
}
