package main;

import java.lang.reflect.InvocationTargetException;

import lombok.Data;

@Data
public class RuntimeObjs {
	public RuntimeObjs() {
		System.out.println("RuntimeObjs.RuntimeObjs()-0-param constructor");
	}
	
	public RuntimeObjs(Integer x,Integer y)
	{
		System.out.println("RuntimeObjs.RuntimeObjs()-2-param constructor "+x+" "+y);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
	   // Class c = Class.forName("main.RuntimeObjs");
      //Object newInstance = c.newInstance();
	   // Constructor con[] = c.getDeclaredConstructors();
	    //Object newInstance2 = con[0].newInstance();
	    //Object newInstance = con[1].newInstance(12,13);
		
		RuntimeObjs objs1 = new RuntimeObjs(12,13);
		System.out.println("Obj One :: "+objs1.hashCode()+"\nSystem Generated HashCode :: "+System.identityHashCode(objs1));
		RuntimeObjs objs2 = new RuntimeObjs(12,13);
		System.out.println("Obj two :: "+objs2.hashCode()+"\nSystem Generated HashCode :: "+System.identityHashCode(objs2));
	    System.out.println(objs1.equals(objs2));
	}//main
}//class
/* 
 *
 *DeCompiled Code of above
 *
package main;

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

public class RuntimeObjs {
public RuntimeObjs() {
   System.out.println("RuntimeObjs.RuntimeObjs()-0-param constructor");
}

public RuntimeObjs(Integer x, Integer y) {
   PrintStream var10000 = System.out;
   String var10001 = String.valueOf(x);
   var10000.println("RuntimeObjs.RuntimeObjs()-2-param constructor " + var10001 + " " + String.valueOf(y));
}

public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
   RuntimeObjs objs1 = new RuntimeObjs(12, 13);
   PrintStream var10000 = System.out;
   int var10001 = objs1.hashCode();
   var10000.println("Obj One :: " + var10001 + "\nSystem Generated HashCode :: " + System.identityHashCode(objs1));
   RuntimeObjs objs2 = new RuntimeObjs(12, 13);
   var10000 = System.out;
   var10001 = objs2.hashCode();
   var10000.println("Obj two :: " + var10001 + "\nSystem Generated HashCode :: " + System.identityHashCode(objs2));
   System.out.println(objs1.equals(objs2));
}

public boolean equals(Object o) {
   if (o == this) {
      return true;
   } else if (!(o instanceof RuntimeObjs)) {
      return false;
   } else {
      RuntimeObjs other = (RuntimeObjs)o;
      return other.canEqual(this);
   }
}

protected boolean canEqual(Object other) {
   return other instanceof RuntimeObjs;
}

public int hashCode() {
   int result = true;
   return 1;
}

public String toString() {
   return "RuntimeObjs()";
}
}*/