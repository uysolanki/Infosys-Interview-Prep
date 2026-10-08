package day4;

class Solution {
	
	public static void main(String[] args) {
		int nums[]= {-2,1,-3,4,-1,2,1,-5,4};
		int sum=maxSubArray(nums);
		System.out.println(sum);
	}
												//                                                           i
    public static int maxSubArray(int[] nums) {	//[-2,		1,		-3,  	4,	 	-1,		2,	 	1,	 	-5,		4]
                                                //[-2,		1,		-2,	    4,		 3,		5,		6,		 1,		5]    
        int[] dp = new int[nums.length];		//[-2,		1,		-2 ,	4,		 3,		5,		6,		 1 ,	5]

        dp[0] = nums[0];						//max=6

        int maxSum = dp[0];											//max(1,  -2+1)		=1
        															//max(-3, -2)       =-2
        for (int i = 1; i < nums.length; i++) {						//max(4,  -2+4)     =4
        															//max(-1, 4-1)      =3
            dp[i] = Math.max(										//max(2,  3+2)      =5
                nums[i],											//max(1,  5+1)      =6
                dp[i - 1] + nums[i]									//max(-5, 1)        =1
            );														//max(4,  1+4)      =5

            maxSum = Math.max(maxSum, dp[i]);
        }

        return maxSum;
    }
}