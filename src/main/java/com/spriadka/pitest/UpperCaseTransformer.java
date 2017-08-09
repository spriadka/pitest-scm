package com.spriadka.pitest;

public class UpperCaseTransformer implements StringTransformer {
    @Override
    public String transform(String s) {
        return s.toUpperCase();
    }
}
