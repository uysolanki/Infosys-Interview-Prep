package day4;

import java.util.HashSet;
import java.util.Set;

public class MaxLengthOfSubstringContainingDistinctChars {

	public static void main(String[] args) {
		//String s="abcade";
		String s="abcab";
		int length=findLength(s);
		System.out.println(length);
		
	}

	private static int findLength(String s) {  //['b','c',
		Set<Character> hashset=new HashSet();
		int left=0;
		int max=0;
		
		for(int right=0;right<s.length();right++)
		{
			while(hashset.contains(s.charAt(right)))
			{
				hashset.remove(s.charAt(left));
				left++;
			}
			hashset.add(s.charAt(right));
			max=Math.max(max, (right-left)+1);
		}
		return max;
		
	}

}
