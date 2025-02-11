package main;

public class RandomNumber 
{
	static int randomNumber;
	private static void generateRandomNumber()
	{
		try {
			randomNumber = 10;
			return ;
		} catch (Exception e) {
             randomNumber = -1;
		}
	}
   public static void main(String[] args) 
   {
	    generateRandomNumber();
	    System.out.println(randomNumber);
   }
}
