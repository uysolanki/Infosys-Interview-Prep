package day11;

public class CamelCase {

	public static void main(String[] args) {
		String str="BOB loves-coding";
		String result=convertToCamelCase(str);
		System.out.println(result);
	}

	private static String convertToCamelCase(String str) {
		
		StringBuffer result=new StringBuffer("");
		boolean nextCapital=false;
		
		for(char ch:str.toCharArray())
		{
			if(Character.isLetter(ch))
			{
					if(result.length()==0)
					{
						result.append(Character.toLowerCase(ch));
					}
					else if(nextCapital)
					{
						result.append(Character.toUpperCase(ch));
						nextCapital=false;
					}
					else
					{
						result.append(Character.toLowerCase(ch));
					}
				
			}
			else
			{
				nextCapital=true;
			}
		}
		return result.toString();
	}

}
