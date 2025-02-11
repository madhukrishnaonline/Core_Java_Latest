package main;

public class IntegerDouble 
{
	public int x = 5;
	public int y = 2;
	public float result = (float)  x/y;
	public static void main(String[] args)
	{
        IntegerDouble id = new IntegerDouble();
        System.out.println("Result :: "+id.result);
	}
}
