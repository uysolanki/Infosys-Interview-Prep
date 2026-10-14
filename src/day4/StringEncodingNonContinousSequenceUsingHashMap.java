package day4;

import java.util.HashMap;
import java.util.Map;

public class StringEncodingNonContinousSequenceUsingHashMap {
public static void main(String[] args) {
	 String str = "aaabbbccaa";

     HashMap<Character, Integer> map = new HashMap<>();

     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);

         map.put(ch, map.getOrDefault(ch, 0) + 1);
     }

     StringBuilder sb = new StringBuilder();

     for (Map.Entry<Character, Integer> entry : map.entrySet()) {
         sb.append(entry.getKey())
           .append(entry.getValue());
     }

     System.out.println(sb);
 }
}