package com.company;

public class Go<T> extends GenericsType {
    @Override
    public void setG1(Object g1) {
        super.setG1(g1);
    }

    public void helo(){
        System.out.println("yedde");
    }

    @Override
    public void setG2(Object g2) {
        super.setG2(g2);
    }

    @Override
    public Object getG1() {
        return super.getG1();
    }

    @Override
    public Object getG2() {
        return super.getG2();
    }

    public static void main(String[] args) {
        Go<Object> go = new Go();
        go.setG1(55);
        go.setG2("hello");

        go.helo();

        go.getG1();
        go.getG2();
        System.out.println(go);
    }
}
