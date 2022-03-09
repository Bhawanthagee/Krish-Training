package com.company;

public class Main {
    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape cloneShape =ShapeCache.getShape("1");
        System.out.println("shape : "+cloneShape.getType());

    }
}
