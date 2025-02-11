package com.naresh.list.mcqs;

import java.util.ArrayList;
import java.util.Collection;

public class Test
{
     public static void main(String[] argv) 
     {
           Collection c = new ArrayList();
           c.add("1");
           c.add("2");
           c.add("3");
           Collection c1 = new ArrayList();
           c1.add("1");
           c.retainAll(c1);
           System.out.println(c);
     }
}