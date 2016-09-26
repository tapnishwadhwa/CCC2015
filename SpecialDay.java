import java.util.Scanner;

public class SpecialDay
{
   public static void main (String[] args) 
   
   
   {
 Scanner in = new Scanner(System.in);
 
 
 int curMonth = in.nextInt();
 int curDay = in.nextInt();
 
 
 if ( curMonth == 2){
 
   if ( curDay == 18){
   System.out.print("Special");
   }
    
 }
  
      if ( curMonth > 2){
        if ( curDay > 18){
            System.out.println("After");
        } else if ( curDay < 18){
            System.out.println("After");
        }
            
      }
      
      
      if ( curMonth < 2){
        if ( curDay < 18){
            System.out.println("Before");
        } else if ( curDay > 18){
            System.out.println("Before");
        }
            
      }

             
      }
      
 }