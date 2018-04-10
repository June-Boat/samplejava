package samplejava;

public class HelloBunny
{
   public static void main(String[] args)
   {
      String sentence = "\u03C0 \uD835\uDD6B";//有空格
      System.out.println(sentence);
      int lengthU = sentence.length();
      int lengthP = sentence.codePointCount(0, lengthU);
      System.out.println(lengthU);        // 4个code units
      System.out.println(lengthP);        // 3个code points
      
      int i = sentence.codePointAt(3);    // i=2 true  i=0,1,3 false  i=4 out of bound
      System.out.println(i);
      boolean b = Character.isSupplementaryCodePoint(i);
      System.out.println(b);      
      
      //??以下
      char[] c1 = {'明','日','科','技'};

      int cha = Character.codePointAt(c1,2);
      
      

      System.out.println(cha);

   }
}