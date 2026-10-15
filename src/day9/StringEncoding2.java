package day9;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringEncoding2 {

	public static void main(String[] args) {
//		String str = "aaabbbcdaab";
		String str = "aaabbbccdd";
//		String str = "AaabBbcd";
//		String str = "   aaab   bbcDd";	   //==>  "aaabbbcdd"
//		String str = "";
//		String str =null;
		
		if(str==null || str.trim().length()==0)
		{
			System.out.println("Invalid String");
			return;
		}
		
		str=str.trim().replaceAll("\\s+", "").toLowerCase();
		
		StringBuffer result=new StringBuffer("");  //"a1"
		
		HashMap<Character,Integer> hashmap=new HashMap();
		
		for(char ch:str.toCharArray())			//ch='b'		
		{
			if(hashmap.containsKey(ch))
			{
				hashmap.put(ch, hashmap.get(ch)+1);
			}
			else
			{
				hashmap.put(ch, 1);
			}
		}
		System.out.println(hashmap);
		
		for(Entry<Character,Integer> entry: hashmap.entrySet())
		{
			result.append(entry.getKey()).append(entry.getValue());
		}
		
		System.out.println(result);
	}

}

/*
{
a=3
b=1
}
*/
