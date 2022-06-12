package com.company;


import java.util.*;

public class GenericsType<T> {
    //Java Generic Method
    T g1;
    T g2;

    public T getG1() {
        return g1;
    }

    public void setG1(T g1) {
        this.g1 = g1;
    }

    public T getG2() {
        return g2;
    }

    public void setG2(T g2) {
        this.g2 = g2;
    }

    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){

        return g1.getG1().equals(g2.getG2());
    }

    public static void main(String args[]){
        GenericsType<String> g1 = new GenericsType<>();
        g1.setG1("Pankaj");

        GenericsType<String> g2 = new GenericsType<>();
        g2.setG2("Pankaj");

        boolean isEqual = GenericsType.<String>isEqual(g1, g2);
        //above statement can be written simply as
        isEqual = GenericsType.isEqual(g1, g2);
        //This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
        //Compiler will infer the type that is needed
        System.out.println(isEqual);
    }
}
