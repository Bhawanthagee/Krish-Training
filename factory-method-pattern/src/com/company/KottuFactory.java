package com.company;

public class KottuFactory {
    public Kottu getKottu(String type){
        if(type==null){
            return null;
        }
        if(type.equalsIgnoreCase("egg kottu")){
            return new EggKottu();
        }
        if(type.equalsIgnoreCase("chicken kottu")){
            return new ChickenKottu();
        }
        if(type.equalsIgnoreCase("Seafood kottu")){
            return new SeaFoodKottu();
        }
        if(type.equalsIgnoreCase("mix kottu")){
            return new MixedKottu();
        }

        return null;
    }
}
