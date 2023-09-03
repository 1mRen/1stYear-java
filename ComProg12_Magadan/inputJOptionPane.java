import javax.swing.JOptionPane;

class inputJOptionPane
{
   public static void main(String[] args)
   {
      String name = JOptionPane.showInputDialog("What's your name?");
      String feeling = JOptionPane.showInputDialog("Hello " + name + ", How are you feeling right now??");
      int age = Integer.parseInt(JOptionPane.showInputDialog("I see, I forgot to ask how old are you?"));
      JOptionPane.showMessageDialog(null,"So your name is " + name + ", " + age + " years of age" + ". Currently feeling " + feeling);
      JOptionPane.showMessageDialog(null,"It's nice to make your acquintance ^ ^");
   }
}