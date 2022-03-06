package com.bhawantha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//separating each character of the given word
public class OperationsOfOccurrences {
    public List<Character> arrangeWord(String userInput){

        List<Character> wordAsList = new ArrayList<>();
        for(int i =0; i<userInput.length();i++){
            wordAsList.add(userInput.charAt(i));
        }

         return wordAsList;
    }
    //Finding the occurrences in the given word.
    public HashMap findOccurrencesChars(List userInputList){
        HashMap<Character,Integer>occurrencesHMP = new HashMap<Character, Integer>();

        for(int i =0;i<userInputList.size();i++){
            int count = 0;

           for(int k =0;k< userInputList.size();k++){
               if(userInputList.get(i)==userInputList.get(k)) {
                   count = count + 1;
               }
               occurrencesHMP.put((Character) (userInputList).get(i),count);
           }

        }

        return occurrencesHMP;
    }
}
