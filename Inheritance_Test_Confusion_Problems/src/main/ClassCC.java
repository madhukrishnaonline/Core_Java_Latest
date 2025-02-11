package main;

import test.ClassAA;
import test.ClassBB;

public class ClassCC
{
  public static void main(String[] args) throws Exception {
	ClassAA ca = new ClassBB();
	System.out.println(ca.sum(22,33));
}
}
