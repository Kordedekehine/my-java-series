package com.timbuchalka;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java","a compiled high level , object oriented, Platform independent language");
        languages.put("Python", "object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol","an algorithmic language");
        languages.put("BASIC","Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")){
            System.out.println("Languages already contains Java");
        }else
            System.out.println("Does not contain Java");

        languages.remove("Lisp");
        if (languages.remove("Algol","an algorithmic language")){
            System.out.println("Algol removed");
        }else
            System.out.println("Algol not removed,key/value pair not found");
        //To print all out
        System.out.println("=========================================");
        for (String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}