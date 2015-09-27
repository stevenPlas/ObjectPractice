package chap6prob1;
import math1.Math;
import word.WordProblem;
import java.util.Scanner;

public class Chap6prob1 {

    public static void main(String[] args) {
           Scanner keyboard = new Scanner(System.in);//Keyboard Input
        
        double math1,  math2;//Math variables
        int userInputNum;//menu selection & do while variable 
      do{//do while loop  
      System.out.println("\t*************************************\n"
                       + "\t*       Steve's Calculator          *\n"//graphic
                       + "\t*************************************");
      //Menu     
      System.out.println( "1: Addition\n"
                        + "2: Subtraction\n"
                        + "3: Multiplication\n"
                        + "4: Devision\n"
                        + "5: Word Counter\n"
                        + "6: Exit Program\n");
      
      
      System.out.print("Please Pick An Option: ");
      userInputNum = keyboard.nextInt();//menu selection
      System.out.print("\n");//spacer
       
      
        
        if (userInputNum >= 1 && userInputNum <= 4){//math variable if statement
            System.out.println("Please enter num 1: ");
                math1 = keyboard.nextDouble();
        
        System.out.println("Please enter num 2: ");
                math2 = keyboard.nextDouble();
        
        
        Math Calc = new Math(math1, math2);//new math class
        
         if (userInputNum == 1){
           System.out.println(Calc.addition());//print addition
      }
      
         else if (userInputNum == 2){
          System.out.println(Calc.subtraction());//print subtraction
      }
        
         else if (userInputNum == 3){
             System.out.println(Calc.multi());//print multiplacation 
         }
         
         else if (userInputNum == 4){
             System.out.println(Calc.division());//print division
         }
         
                 
      }
        
        else if (userInputNum == 5){
            WordProblem Love = new WordProblem();//word prob class
            Love.love();//print word problem
        }
        
        
        //wait for user input to continue
        if (userInputNum >= 1 && userInputNum <= 5){
        System.out.println("Press any key to continue...");
        try{
            System.in.read();
        }  
        catch(Exception e){}
        
        }
        }while (userInputNum != 6);
    }
    
    
}
