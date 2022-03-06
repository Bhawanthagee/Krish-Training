package com.company;

public class Main {

    public static void main(String[] args) {
        SingletonExample object = SingletonExample.getSingletonExample();
        object.showMessage();
        SingletonExample object2 = SingletonExample.getSingletonExample();

        System.out.println(object);
        System.out.println(object);
    }
}
