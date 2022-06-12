package com.company;
import java.util.ArrayList;
import java.util.List;

public class Box {
    public static <IntClass> void main(String[] args) {
        //autoboxing example
//        List<Integer> li = new ArrayList<Integer>();
//        for (int i = 1; i < 50; i += 2)
//            System.out.println(li.add(i));

//        Integer i = new Integer(-8);
//
//        // 1. Unboxing through method invocation
//        int absVal = absoluteValue(i);
//        System.out.println("absolute value of " + i + " = " + absVal);
//
//        List<Double> ld = new ArrayList<>();
//        ld.add(3.1416);    // Π is autoboxed through method invocation.
//
//        // 2. Unboxing through assignment
//        double pi = ld.get(0);
//        System.out.println("pi = " + pi);
//    }
//
//    public static int absoluteValue(int i) {
//        return (i < 0) ? -i : i;

        String [] strArray = new String[10];
        int [] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");

        //instead of this error
        //ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
       // intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i < 10; i++){
            System.out.println(i + " ---> " + intArrayList.get(i).intValue());
        }
        Integer myIntValue = 56; //integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.intValue();
        System.out.println(myInt);

    }
}
