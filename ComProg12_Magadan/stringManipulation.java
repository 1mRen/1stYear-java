//Marc Lawrence C. Magadan

public class stringManipulation{
  public static void main(String[] args){
  // declaring the variable
  String str = "The quick brown fox";
  
     //prints the variable str and its lenght
  System.out.println(str);
  System.out.printf("Length: %s\n", str.length());
  
  //adds the jumps over the lazy dog then prints the length
  str = str.concat(" jumps over the lazy dog.");
  System.out.println(str);
  System.out.printf("%s\nLength: %s \n", str, str.length());
  //checks if str starts with 'The'. if yes 'true', no 'false'
  System.out.printf("Starts with 'The': %s\n", str.startsWith("The"));
  //replaces tge brown, fox, and dog. Then turn it into uppercase
  str = str.replace("brown", "black").replace("fox","wolf").replace("dog", "pig");
  System.out.println(str);
  str = str.toUpperCase();
  System.out.println(str);
  
  
  //checks if str contains brown or black. if yes 'true', no 'false'
  System.out.printf("%s contains 'brown': %s\n", str, str.contains("BROWN"));
  System.out.printf("%s contains 'black': %s\n", str, str.contains("BLACK"));
  // looks for the index of 'PIG' then print it
  System.out.printf("Index of the word 'PIG': %s", str.indexOf("PIG"));

  
  }
}