public class Palindrome
{
  public static void main(Styring[] args)
  {
    String s1="racecar";
    String s2="";
    for(int i=s1.length()-1;i>=0;i--)
    {
      s2=s2+s1.charAt(i);
    }
    if(s1.equals(s2))
    {
      System.out.println("String is Palindrome");
    }
    else
    {
      System.out.println("String is not Palindrome");
    }
  }
}
