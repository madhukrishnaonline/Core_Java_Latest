package main;

import test.CClass;
import test.PClass;

public class GeneralSpecial
{
	public static void main(String[] args) 
	{
		//Generalization
		PClass pc = (PClass)new CClass();
		pc.mk(111);
		//Specialization
		CClass cc = (CClass)new PClass();
		cc.mk(222);
	}
}
