package com.example;

import java.util.*;

public class FindingMissingNumber {



    static Scanner scan = new Scanner(System.in);
    static String userInput;

    public static void main(String[] args){
        Operation operation = new Operation();// creating an object from operation class

        System.out.print("Enter the number sequence separated by commas ',' : ");
        userInput = scan.nextLine(); //taking the input

        ArrayList<Integer> newArrayList = new ArrayList<>();
        int[]sortedArray = new int[newArrayList.size()]; //creating an array list
        newArrayList = operation.putinToArrayList(userInput); // assigning the return value of putinToArray method from operation object
        sortedArray = operation.sortList(newArrayList); //assigning the return value of sortList method from operation object in to sortedArray.



        System.out.println("User input after putting to list"+operation.putinToArrayList(userInput));
        System.out.println("After Sorting : " + Arrays.toString(sortedArray));

        if(operation.missingValue(sortedArray)==null){
            System.out.println("There are no missing values inside the number sequence. but missing value can be either first or last value");
        }else{
            System.out.println("Missing value is : "+operation.missingValue(sortedArray));
        }




    }



}
