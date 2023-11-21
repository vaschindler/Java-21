package org.example.stringTemplates;

import static java.lang.StringTemplate.STR;

public class StringTemplates {

    /*
     * String interpolation, only available in preview mode
     */
    public static String stringInterpolation(String name, int age) {
        return STR."Hello, my name is \{name} and I am \{age} years old.";
    }

    public static void main(String[] args) {
        System.out.println(stringInterpolation("John", 21));
    }
}
