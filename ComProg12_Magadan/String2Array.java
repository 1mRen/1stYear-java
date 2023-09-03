/*
    Name: Marc Lawrence C. Magadan
    Date: May 2, 2023
    Description: This program displays the length of the sentence and also the number of words are there in 
                 the sentence.
*/

public class String2Array
{
	public static void main(String[] args) {
   //sentence
		String str = "The quick  brown fox jumps  over the lazy dog  near the river bank and  stopped.";
      
      //splitting every word of the sentence
      String[] strArray = str.split("\s+");
      
      //output of all the lengths. Length of the whole sentence and number of words.
      System.out.print(str + "\n");
      System.out.printf("String length: %s \n", str.length());
      System.out.printf("Number of words: %s", strArray.length);
	}
}
