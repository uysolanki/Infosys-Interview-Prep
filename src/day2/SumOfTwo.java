package day2;

public class SumOfTwo {

	public static void main(String[] args) {
		int arr[]= {100,150,50,75,300};
		int target=225;
		
		for(int i=0;i<arr.length;i++)			//i			arr[i]			num1		num2	j	arr[j]					flag
		{										//0			100				100			125		0	100      is 100==125 F	0
			int num1=arr[i];					//												1   150      is 150==125 F
			int num2=target-num1;				//												2   50       is 50==125 F
			int flag=0;							//												3   75       is 75==125 F
			for(int j=0;j<arr.length;j++)		//												4	300		 is 300==125 F
			{									
				if(arr[j]==num2)				//1			150				150         75		0	100		is 100==75 F
				{								//												1   150     is 150==75 F
					flag=1;						//												2	50      is 50==75 F
					System.out.println("["+num1+","+num2+"]");
					break;						//												3   75      is 75==75 T		1
				}
			}
			if (flag==1)
				break;
			
		}

	}
				//[150.75]
}
