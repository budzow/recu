public class Recu {

  public static void main (String[] args)
  {
    Pow(2,8);
  }
  
	private static int Pow(int num, int exponent)
	{
	  num = num * Pow(num, exponent-1);
	  return num;
	}
}
