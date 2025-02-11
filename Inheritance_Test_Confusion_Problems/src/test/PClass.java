package test;

public class PClass 
{
    static int a=10,b=20;
     int c = 30,d=40;
     public void m1()
     {
    	 System.out.println("PClass m1() :: "+a+" :: "+b);
    	 m2();
     }
     public void m2()
     {
    	 System.out.println("PClass m2() :: "+c+" :: "+d);
     }
}
