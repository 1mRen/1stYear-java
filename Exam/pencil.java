import java.util.Scanner;

//class object
class pencil{
   private String write;
   private String draw;
   
   //the output
   pencil(String write, String draw){
      setWrite(write);
      setDraw(draw);
      System.out.println("I will gonna draw a " + getDraw() + " or just gonna write an " + getWrite());
      //displayThis();
   }
   
   //method for the write
   public String setWrite(String write){
      if (write == "novel" || write == "notes" || write == "narrative report" || write == "essay")
         this.write = write;
      else
         this.write = "notes";
      return this.write;
   }
   
   //method for the draw
   public void setDraw(String draw){
      if (draw == "dragon" || draw == "hotdog" || draw == "cat" || draw == "castle")
         this.draw = draw;
      else
         this.draw = "hotdog";
   }
   
   //incase
   public String getWrite(){
      return this.write;
   }
   
   public String getDraw(){
      return this.draw;
   }
   
   
   public void displayThis(){
      System.out.println("Write: " + getWrite() + "\nDraw: " + getDraw());
   }
}
   
class main{
   public static void main(String[] args){
   //declaring variables and object
   Scanner obj = new Scanner(System.in);
   String nice;
   
   System.out.println("===============================================================");
   System.out.print("What do you want to write or draw? ");
   nice = obj.nextLine();
   System.out.println("===============================================================");
      
       System.out.println("===============================================================");
   System.out.println("Nice! ");
      pencil writeDraw = new pencil("novel", "serpent");
    System.out.print("or, ");
      pencil writeDraw2 = new pencil("essay", "nature");
    System.out.print("=================================================================");

    

    
    //Marc Lawrence C. Magadan BSIT - 1B 
   }
}
   
