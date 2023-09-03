/*
   Name: Marc Lawrence C. Magadan
   Date: 05/29/23
   Description: Final Project for Comprog12
*/
import java.util.*;

class ProgramMain
{
   // Main menu options
   static String[] mainMenu       =  {"P-Prelim"      ,"M-Midterm"     ,"S-Semi-Finals", "X-Exit"};  
   // Submenu options for each main menu option
   static String[][] subMenu   = {{"1- Pre-Lab.Act#01 - Hello World"   ,"2- Pre-Lab.Act#02 - The Tree" , "3- Pre-Lab.Act#03a - Name and Age","4- Pre-Lab.Act#03c - Calculator" ,"5- Pre-Lab.Act#03c - Input Output using JOptionPane"   ,"6- Pre-Lab.Act#04 - Methods, Classes and Objects"   ,"X-Exit"},                           
                                  {"1- Mid-Lab.Act#01 - Switch"   ,"2- Mid-Lab.Act#02 - Loop"    ,"3- Mid-Lab.Act#03 - Nested Loop"   ,"4- Mid-Lab.Ex#1b - Stages of Life"   ,"X-Exit"},
                                  {"1- SF-Lab.Act#01 - String Start End"    ,"2- SF-Lab.Act#02 - String Manipulation"     ,"3- SF-Lab.Act#03 - Working with Arrays"    ,"4- SF-Lab.Ex#01 - Convert a String to a String Array"    ,"X-Exit"}};
   
   public static void main(String[] args)
   {
      do 
      // Display the main menu and continue until 'X' is chosen
      {
         
      } while (DisplayMainMenu()!='X');
      System.out.printf("\nThank you. Goodbye . . . .");
   }
   
   static char DisplayMainMenu()
   {
       char choice;
       Scanner in = new Scanner(System.in);
       do
       {
          System.out.printf("\n=========================\nM A I N   M E N U\n=========================");
          for (String m:mainMenu)
            {
               System.out.printf("\n%s",m);
            }
          System.out.printf("\n Choice: ");           
          choice = in.next().charAt(0);
       }
       while ( Character.toUpperCase(choice)!='P' && Character.toUpperCase(choice)!='M' && 
               Character.toUpperCase(choice)!='S' && Character.toUpperCase(choice)!='F' && Character.toUpperCase(choice)!='X');
       
       // Display the submenu based on the user's choice
       switch (Character.toUpperCase(choice))
       {
         case 'P': DisplaySubMenu(0);  break;
         case 'M': DisplaySubMenu(1);  break;
         case 'S': DisplaySubMenu(2);  break;
         case 'F': DisplaySubMenu(3);  break;
       }
       return Character.toUpperCase(choice);
   }
   static char DisplaySubMenu(int submenu)
   {
       char choice;
       Scanner in = new Scanner(System.in);
       do
       {
          do
          {
             System.out.printf("\n=========================\nS U B  -  M E N U\n=========================");
             switch (submenu)
             {
               case 0: System.out.printf("\nPRELIM"); break;
               case 1: System.out.printf("\nMIDTERM"); break;
               case 2: System.out.printf("\nSEMI-FINALS"); break;
             }
             for(String m:subMenu[submenu])
               {
                  System.out.printf("\n%s",m);
               }
             System.out.printf("\n Choice: ");           
             choice = in.next().charAt(0);
          }
          while ( Character.toUpperCase(choice)!='1' && Character.toUpperCase(choice)!='2' && Character.toUpperCase(choice)!='3' && 
                  Character.toUpperCase(choice)!='4' && Character.toUpperCase(choice)!='5' && Character.toUpperCase(choice)!='6' && Character.toUpperCase(choice)!='X');
          if (Character.toUpperCase(choice)!='X')
            callFunctions(submenu, choice);
       }
       while (Character.toUpperCase(choice)!='X');
      return ' ';
   }
   
   static void callFunctions(int submenu, char choice)
   {
      System.out.printf("\nEntering menu -> %s\n\n",subMenu[submenu][choice-'0'-1]);
      
      // Call the appropriate function based on the submenu and choice
      switch (submenu)
      {  //Prelim
         case 0: switch (choice)
                  {
                     case '1':   helloWorld.main(null); break;
                     case '2':   theTree.main(null); break;
                     case '3':   nameAge.main(null); break;
                     case '4':   calculator.main(null); break;
                     case '5':   inputJOptionPane.main(null); break;
                     case '6':   computer.main(null); break;
                  }  break;
         case 1: switch (choice)
                  { //Midterms
                     case '1':   sWitch.main(null); break;
                     case '2':   loop.main(null); break;
                     case '3':   nestedLoop.main(null); break;
                     case '4':   stagesOfLife.main(null); break;
                  }  break;
         case 2: switch (choice)
                  { //Semi-Finals
                     case '1':   StringStartEnd.main(null); break;
                     case '2':   stringManipulation.main(null); break;
                     case '3':   array.main(null); break;
                     case '4':   String2Array.main(null); break;
                  } break;
        
        //No finals, because we don't have activities and exercises during that term.
      }
   }  
}
