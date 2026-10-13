package day7;

import java.util.Arrays;

public class CheckAnagrams2 {

	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		
//		String s1="apple";
//		String s2="mango";
		
		if(checkAnagrams(s1,s2))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}

	
	private static boolean checkAnagrams(String s1, String s2) {
		char arr1[]=s1.toCharArray();   //['s', 'i', 'l', 'e', 'n', 't'];
		char arr2[]=s2.toCharArray();   //'l', 'i', 's', 't', 'e', 'n'";
		
		
		Arrays.sort(arr1);             //['e','i','l','n','s','t']
		Arrays.sort(arr2);             //['e','i','l','n','s','t']
		
		String s3=new String(arr1);    //"eilnst"
		String s4=new String(arr2);    //"eilnst"
		
		if(s3.equalsIgnoreCase(s4))
			return true;
		else
			return false;
	}

}
