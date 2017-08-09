package com.spriadka.pitest;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.junit.Assert;
import org.junit.Test;

import java.io.PrintStream;

public class GreeterTest {

    private Greeter greeter;

    private static final String SEPARATOR = System.getProperty("line.separator");

    @Test
    public void testSayHello(){
        final String name = "Simon Priadka";
        ByteOutputStream outputStream = new ByteOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        greeter = new Greeter(name).withOutstream(stream);
        greeter.greet();
        Assert.assertEquals(name + SEPARATOR,outputStream.toString());
    }

    @Test
    public void testGetNameEmpty(){
        Assert.assertEquals("",new Greeter("").getName());
    }

    @Test
    public void testGetName(){
        final String name = "Vladimir Putin";
        greeter = new Greeter(name);
        Assert.assertEquals(name,greeter.getName());
    }

    @Test
    public void testScreamName() {
        final String name = "Donald Trump";
        ByteOutputStream outputStream = new ByteOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        greeter = new Greeter(name).withOutstream(stream);
        greeter.screamName();
        Assert.assertEquals(String.format("%s!", name.toUpperCase()),outputStream.toString());
    }
}
