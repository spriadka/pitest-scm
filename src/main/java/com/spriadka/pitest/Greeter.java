package com.spriadka.pitest;

import java.io.PrintStream;


public class Greeter {

    private String name = "";
    private PrintStream stream = System.out;

    public Greeter(String name) {
        this.name = name;
    }

    public Greeter withOutstream(PrintStream stream) {
        this.stream = stream;
        return this;
    }

    public void greet() {
        stream.println(name);
    }

    public void screamName() {
        stream.printf("%s!",name.toUpperCase());
    }

    public String getName() {
        return name;
    }

}
