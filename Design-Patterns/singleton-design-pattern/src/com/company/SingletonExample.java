package com.company;

public class SingletonExample {

    //creating an object of singletonExample
    private static SingletonExample singletonExample = new SingletonExample();

    //private constructor so that this class can not be instantiated
    private SingletonExample(){}

    //Get the only object available in the class
    public static SingletonExample getSingletonExample() {

        //Double-checking Singleton
        if(singletonExample==null){
            synchronized (SingletonExample.class){
                if(singletonExample==null){
                    singletonExample=new SingletonExample();
                }
            }
        }

        return singletonExample;
    }
    public void showMessage(){
        System.out.println("Hello World");
    }
}
