package string.remove.duplicates;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatedElements 
{
     public static void main(String[] args) 
     {
		String str = "repetitive";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(Character ch:str.toCharArray())
		{
		     map.merge(ch,1,Integer::sum);	
		}//for
            System.out.println(map.entrySet());
            Entry<Character,Integer> max = Collections.max(map.entrySet(),Map.Entry.comparingByValue());
            System.out.println(max.getKey()+"="+max.getValue());
     }//main
}//class