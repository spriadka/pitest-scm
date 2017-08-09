package com.spriadka.pitest;

/**
 * Created by priad on 09.08.2017.
 */
public class LowerCaseTransformer implements StringTransformer{
    @Override
    public String transform(String s) {
        return s.toLowerCase();
    }
}
