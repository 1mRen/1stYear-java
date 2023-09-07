public class halfDiamond{
  public static void main (String[] args){
  
  String star = "*";
  int limt = 5;
  
      for (int i = 0; i < limt; i++){
        for (int j = 0; j < i + 1; j++)
                System.out.print(star);
           System.out.print("\n");
        }
        for (int i = 1; i < limt; i++) 
        {
            for (int j = i; j < limt; j++)
               System.out.print(star);
          System.out.print("\n");
        }  
  }
}