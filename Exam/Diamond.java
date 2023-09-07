public class Diamond{
  public static void main (String[] args){
  
  
  int limt = 3;
  
      for (int a = 1; a <= limt; a++) {
         for (int b = limt; b > a; b--) {
         System.out.print(" ");
         }

      for (int c = 1; c <= a ; c++) {
         System.out.print(a + " ");
         }
         System.out.println();
         }

      for (int a = limt - 1; a >= 1; a--) {
         for (int b = limt; b > a; b--) {
         System.out.print(" ");
         }
         for (int c = 1; c <= a ; c++) {
         System.out.print(a + " ");
         }
         System.out.println();
     }
   }
}                 
  
