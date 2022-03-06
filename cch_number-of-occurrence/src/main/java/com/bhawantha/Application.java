package com.bhawantha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        OperationsOfOccurrences operations = new OperationsOfOccurrences();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String wordFromUser = scan.nextLine().toLowerCase();

        List<Character>charactersInList = new ArrayList<>();

       charactersInList= operations.arrangeWord(wordFromUser);
        System.out.println(charactersInList);
        System.out.println(operations.findOccurrencesChars(charactersInList));



    }
}
