package day7;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharFromAString3 {
	
	public static void main(String[] args) {
				//['v','i','r','a','t',kohl]
		String str="virat kohli";
//		String str="Mahendra Singh Dhoni";				//mahendrasighhdhoni
//		String str="apple";
//		String str="Rohit";
//		String str=null;
//		String str="";
//		String str="           ";
		if(str==null || str.trim().length()==0)
			System.out.println("Invalid Input");
		else
		{
		str=str.toLowerCase().replaceAll("\\s+", "");
		System.out.println(str);
		char ch=checkFirstRepeatedChar(str);
		System.out.println(ch=='0'? "No Repeated char found" : "First repeated char is "+ch);
		}
		
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
					return ch;
				}
		}
		
		return ans;
	}

	
}

//
//i
