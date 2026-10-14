package day9;

public class StringEncoding {

	public static void main(String[] args) {
//		String str = "aaabbbcd";
//		String str = "AaabBbcd";
		String str = "   aaab   bbcDd";	   //==>  "aaabbbcdd"
//		String str = "";
//		String str =null;
		
		if(str==null || str.trim().length()==0)
		{
			System.out.println("Invalid String");
			return;
		}
		
		str=str.trim().replaceAll("\\s+", "").toLowerCase();
		
		StringBuffer result=new StringBuffer("");  //"a1"
		int count=1;
		
		for(int i=0;i<str.length();i++)
		{
			if(i<str.length()-1 &&  str.charAt(i)==str.charAt(i+1))
				count++;
			else
			{
				result.append(str.charAt(i)).append(count);
				count=1;
			}
				
		}
		
		System.out.println(result);

	}

}
