package main;

public class ForPercentile {
public static void main(String[] args) {
	  int a =0,b=0;
	  for(int i=0;i<=5;i++)
	  {
		  if(i%1==0)
		  {
			  a++;
		  }
		  if(i%2==1)
		  {
			  b = a+1;b++;
		  }
	  }//for
	  System.out.println(a+" "+b);
}
}
