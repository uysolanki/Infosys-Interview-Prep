package day7;

import java.util.Arrays;

public class CheckAnagrams3 {

	public static void main(String[] args) {
//		String s1="silent";
//		String s2="listen";
		
		String s1="apple";
		String s2="mango";
		
		System.out.println(checkAnagrams(s1,s2)?"Anagrams":"Not Anagrams");
	}

	private static boolean checkAnagrams(String s1, String s2) {
		
		String s3= getSortedString(s1);
		String s4= getSortedString(s2);
		
		return s3.equalsIgnoreCase(s4);
	}

	private static String getSortedString(String s1) {
		char arr1[]=s1.toCharArray(); 
		Arrays.sort(arr1); 
		String s4=new String(arr1);  
		return s4;
	}

}
