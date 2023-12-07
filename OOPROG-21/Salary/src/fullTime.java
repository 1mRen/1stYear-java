
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mARC
 */
public class fullTime extends teacher implements teaching{
   
   public fullTime(){}
    
   public fullTime(String Fname, String Lname, double hrate, double hrs) {
         super(); // Call the constructor of the superclass without parameters
         setFname(Fname);
         setLname(Lname);
         setHrate(hrate);
         setHrs(hrs);
    }

   
   @Override
   public double compute(double hrs, double hrate){
       return hrate*hrs;
   }
   
   @Override
   public String classification(){
       return "FullTime";
   } 
   
}