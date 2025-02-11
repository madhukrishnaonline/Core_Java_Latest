package main;

public class Constructor 
{
	public static String msg;
	public Constructor() {
		this(msg);
	}
	@SuppressWarnings("static-access")
	public Constructor(String msg)
	{
		//this();
		this.msg = msg;
	}
	@Override
	public String toString() 
	{
		return msg;
	}
	public static void main(String[] args) 
	{
         System.out.println(new Constructor());
	}//main
}//class
