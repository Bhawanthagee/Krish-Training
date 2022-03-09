package com.company;

import java.util.Hashtable;

public class ShapeCache {
    public static Hashtable<String, Shape>shapeMap = new Hashtable<String,Shape>();

    public static Shape getShape(String shapeId){
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();



    }
    public static void loadCache(){
        Square square = new Square();
        square.setId("1");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
