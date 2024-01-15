package com.example.learnedpatterns.singletonPattern.singleton;

public class JavaSingleton {

    private JavaSingleton() {}

    private String name = "Sun";

    private static JavaSingleton instance;

    public static JavaSingleton getInstance(){
        if (instance == null){
            instance = new JavaSingleton();
        }
        return instance;
    }

    public String getName(){
        return name;
    }

}
