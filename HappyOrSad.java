
//**********************************************************
// Assignment: CCC2015 J2 Happy or Sad
//
// Description: A program that calculates the overall mood of a message 
//
// Author: Tapnish
//
// Date Start: September 18th, 2016
// Date Completed: September 22nd, 2016
//
// Completion time: 2 hours
//              
//
// Honor Code: I pledge that this program represents my own
// program code. I received help from no one in designing and
// debugging my program.
//*********************************************************



import java.util.Scanner;

public class HappyOrSad
{
   public static void main (String[] args) 
   
   
   {
Scanner in = new Scanner(System.in);
String text = in.nextLine();
     
int happy = 0, sad = 0;
int i;
      
for( i =0; i < text.length(); i++){                                     
if(text.charAt(i) == ')'){
happy++; }
         }
         
for( i =0; i < text.length(); i++){
if(text.charAt(i) == '('){
sad++;}          
      } 
      
if (happy == sad){
System.out.println("unsure");
      
}
     
else if (happy > sad){
System.out.println("happy");
     
}
else if (sad > happy){
System.out.println("sad");
}
}             
}