package day4;

public class StringEncodingContinousSequence {
public static void main(String[] args) {
	
	String str="AaabBbcd";
	
	if(str==null || str.length()==0)
	{
		System.out.println("Invalid Input");
		return;
	}
	str=str.replaceAll("\\s", "").toLowerCase();
	StringBuilder sb=new StringBuilder();									//
	int count=1;															
	for(int i=0;i<str.length();i++)
	{
		if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
		{
			count++;
		}
		else
		{
			sb.append(str.charAt(i)).append(count);
			count=1;
		}
	}
	
	System.out.println(sb);
}
}
