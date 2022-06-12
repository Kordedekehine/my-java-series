package com.company;



 public interface  Okay<T> {
     public void hello(T world);
}

class Oyana implements Okay {
    @Override
    public void hello(Object world) {
        System.out.println("hello i'm 24 " + world);
    }



    public static void main(String[] args) {
        Oyana oyana =new Oyana();
        oyana.hello(67);
    }
}





