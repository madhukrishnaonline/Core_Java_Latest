package main;

public class IntegereArray {
public static void main(String[] args) {
	int ia[] = new int[] {1,2,3,4,5};
	int noOfElements  = ia.length;
	int sum=0;
	for(int i=0;i<=noOfElements;i++)
	{
		sum += ia[i];
	}
	System.out.println(sum);
}
}
