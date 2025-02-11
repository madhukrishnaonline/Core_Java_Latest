package string.remove.duplicates;

public class RemoveSpacesInString 
{
	public static void main(String[] args) 
	{
		String str = "java programming language ";
		
		String noSpace = str.strip();
		System.out.println(noSpace);
	}//main
}//class