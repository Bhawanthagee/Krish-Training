import java.util.Scanner;

class Main{
 public static void main(String[] args){

  int distanceFromUser;

  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the distance");

  distanceFromUser = scan.nextInt();
  int numberOfJumpsNeed = distanceFromUser/3;
  int time =0;
  int remainingJumps;
  int jumpSets;
  
  numberOfJumpsNeed = distanceFromUser / 3;
  remainingJumps = numberOfJumpsNeed % 3;
  jumpSets = numberOfJumpsNeed / 3; 
  
  time = jumpSets * 6;

   if(jumpSets ==0){
   switch(remainingJumps){
    case 1 :
     time = time + 1;
     break;
    case 2 :
     time = time + 3;
     break;
   }
  }

  
System.out.println("Wiki's jump completion time is : "+ time +" seconds");

}
}