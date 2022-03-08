"use strinct";

const ps = require("prompt-sync");
const prompt = ps();

var size=prompt("Enter size of the array : ");
const arr=[];

//getting user input as a array
for(var i=0;i<size;i++){
    let input=prompt("Enter numbers : ");
    arr[i]=input; 

}



function addZeros(array){
    
    var max;  
    for(var i=0; i < array.length ;i++){
        for(var k =0; k<array.length-1;k++){
            if(array[i].length<array[k].length){
                max=array[k].length;           
            }
        }
    }
    console.log("max "+max);
    var needZeros
    for(var h =0 ; h<array.length ; h++){
      needZeros = max-array[h].length;
      for(var t=0 ;t< needZeros;t++){
          array[h]="0"+array[h];
          
      }
      
      
       
    }
   
    
   
    return array;
}
console.log(arr);


const addZeroToNumber = addZeros(arr);
const sortedArr =sort(addZeroToNumber);//assigning sorted array.

console.log(sortedArr);
console.log("Third larget number is : "+thirdLargestNumber(addZeroToNumber));
 
  function thirdLargestNumber(array){
      var thirdLargestNumber;
      thirdLargestNumber = array[array.length-3];
      return thirdLargestNumber
  }

 
  function sort(array){
   
   for(var i=0; i<array.length;i++){
    for(j=0;j<array.length;j++){
        if(array[j]>array[j+1]){
            var temp=array[j];
            array[j]=array[j+1];
            array[j+1]=temp;
        }
    }
   }
    return array;
  }