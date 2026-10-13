package day7;

public class WaterCollection {

	public static void main(String[] args) {
//		int heights[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		int heights[] = {1, 8, 9, 2, 5, 8};
		int max=calculateMaxWater(heights);
		System.out.println(max);
	}

	private static int calculateMaxWater(int[] heights) {
		
		int start=0;
		int end=heights.length-1;
		
		int maxArea=0;										//0,8
		
		while(start<end)
		{
		int height=Math.min(heights[start], heights[end]);  //1
		int width=end-start;								//8
		int area=height*width;								//8
		
		if(area>maxArea)									//8>0 true
		{
			maxArea=area;
		}
		
		if(heights[start]<=heights[end])
			start++;
		else
			end--;
		}
		
		return maxArea;
		
	}

}
