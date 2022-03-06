package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Operation {
    //Method responsible for putting string values in to array list and removing commas.
    public ArrayList putinToArrayList(String userInput){
        String[] elements = userInput.split(",");
        List<Integer> listI = new ArrayList<Integer>();
        try{
            for(int i =0; i< elements.length; i++){
                listI.add(Integer.parseInt(elements[i]));
            }
        }catch (NumberFormatException e){
            System.out.println("There is a Letter inside the numbers. its has been removed :)");
        }
        return (ArrayList) listI;
    }

    //Method that responsible for sorting the Arraylist.
    public int[] sortList(List<Integer> userInput){

        int[]sortedList = new int[userInput.size()];
        Iterator iterator = userInput.iterator();
        for(int k=0 ;k< sortedList.length;k++){
            sortedList[k]=(int)iterator.next();
        }

        for(int i =0; i< sortedList.length-1; i++){
            for(int j=0 ; j< sortedList.length-1 ;j++){
                if(sortedList[j]>sortedList[j+1]){
                    int temp = sortedList[j];
                    sortedList[j] = sortedList[j+1];
                    sortedList[j+1] = temp;
                }

            }

        }
        return sortedList;
    }

    //Method to check missing value from array

    public List missingValue(int[] sortedArray){

        int missingValue ;
        String stringMissingValue ;
       List<Integer> missingValuesList = new ArrayList<>();

        for(int i =0;i< sortedArray.length;i++){
            try{
                if(sortedArray[i]==sortedArray[i+1]-1){
                }
                else{
                    missingValue = sortedArray[i]+1;
                    missingValuesList.add(sortedArray[i]+1);

                    if(sortedArray[i]+3==sortedArray[i+1]){
                        missingValuesList.add(sortedArray[i]+2 );
                    }

                    //return stringMissingValue = String.valueOf(missingValue);



                }

            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println();
            }
        }
        return missingValuesList;
    }
}
