"use strict";

const ps = require("prompt-sync");
const promt = ps();

let firstWord = promt("Enter first word : ");
let secondWord = promt("Enter second word : ")

findSameLetters(firstWord,secondWord);

//finding leetrs from both words are same after sorted
function findSameLetters(wordOne,wordTwo){
    
    var sortedWordOne = sort(wordOne); 
    var sortedWordTwo = sort(wordTwo);
    
    var isAnagram = true;
   

    if(sortedWordOne.length==sortedWordTwo.length){
        for(var i=0; i<sortedWordOne.length; i++){
            if(sortedWordOne.charAt(i)!=sortedWordTwo.charAt(i)){
                isAnagram=false;
            }else{
                isAnagram=true;
            }
        }
        if(isAnagram){
            console.log("Given Two Words are anagram words. ");
        }else{
            console.log("Given Two Words are not anagram words. ");
        }

    }else{
        console.log("Given Two Words are not equal in size.");


    
}
}
//sorting both user input values
function sort(arr) {
    arr = arr.split("");
    for (var i = 0; i < arr.length; i++) {
        for (var j = 0; j < arr.length; j++) {
            if (arr[j] > arr[i]) {
                var temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr.join("");
}

