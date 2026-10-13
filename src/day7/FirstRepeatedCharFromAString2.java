package day7;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharFromAString2 {
	
	public static void main(String[] args) {
				//['v','i','r','a','t',kohl]
		String str="virat kohli";
//		String str="Mahendra Singh Dhoni";				//mahendrasighhdhoni
//		String str="apple";
		str=str.toLowerCase().replaceAll("\\s+", "");
		System.out.println(str);
		char ch=checkFirstRepeatedChar(str);
		System.out.println("First repeated char is "+ch);
		
	}

	private static char checkFirstRepeatedChar(String str) {
		Set<Character> hashset=new HashSet();			//['a','p']    //ans='p'
		char ans='0';
		for(char ch:str.toCharArray())					//ch='p'
		{
			if(!hashset.contains(ch))
				hashset.add(ch);
				else
				{
					ans=ch;
					break;
				}
		}
		
		return ans;
	}

	
}

//
//i
