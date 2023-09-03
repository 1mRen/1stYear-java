public class computer
{
String brand, type;

public computer(String brand, String type){
   this.brand = brand;
   this.type = type;
   
   System.out.printf("I have a %s with a brand of %s \n", this.type, this.brand);
   }
   
   public void nice(){
      System.out.printf("A %s %s? Nice! \n", brand, type);
   }
   
   public void boo(){
      System.out.printf("A %s %s? Boo! \n", brand, type);
   }
   
   public static void main (String args[]){
      computer laptop = new computer ("Dell", "Laptop");
      computer smartphone = new computer("Techno","Smartphone");

      laptop.boo();
      smartphone.boo();

      laptop.nice();
      smartphone.nice();
   }
}