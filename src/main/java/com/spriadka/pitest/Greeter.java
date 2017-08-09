package com.spriadka.pitest;

import java.io.PrintStream;

/**
 * Created by priad on 08.08.2017.
 */
public class Greeter {

    private final String name;

    public Greeter(String name) {
        this.name = name;
    }

    public void sayHello(PrintStream stream) {
        stream.println(name);
    }

}
