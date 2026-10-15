package day10;

import java.util.HashSet;
import java.util.Set;

public class LengthOfMaxSubstringWithUniqueChars {
													//max=0,1,2,3
	public static void main(String[] args) {		//[a,b,c]
		//String str="abcabcab";
		//String str="aaaaa";
		String str="abcabcdweaby";
		if(str==null || str.trim().length()==0)
		{
			System.out.println("Invalid String");
			return;
		}
		
		str=str.trim().replaceAll("\\s+", "").toLowerCase();
		
		int left=0;
		int max=0;
		
		Set<Character> hashset=new HashSet();
		for(int right=0;right<str.length();right++)
		{
				while(hashset.contains(str.charAt(right)))
				{
					hashset.remove(str.charAt(left));
					left++;
				}
				hashset.add(str.charAt(right));
				max= Math.max((right-left)+1, max);
		}
				
			System.out.println(max);	
			
	}

}
