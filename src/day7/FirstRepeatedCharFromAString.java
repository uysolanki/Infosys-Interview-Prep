package day7;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharFromAString {
	
	public static void main(String[] args) {
		Set<Character> hashset=new HashSet();			//['v','i','r','a','t',kohl]
//		String str="virat kohli";
		String str="Mahendra Sighh Dhoni";				//mahendrasighhdhoni
		str=str.toLowerCase().replaceAll("\\s+", "");
		
		for(char ch:str.toCharArray())					//ch='t'
		{
			if(!hashset.contains(ch))
				hashset.add(ch);
				else
				{
					System.out.println("First repeated char is "+ch);
					break;
				}
		}
		
	}

	
}

//
//i
