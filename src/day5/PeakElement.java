package day5;

public class PeakElement {

	public static void main(String[] args) {
//		int arr[]= {1,2,3,1};   //eidetic memory  human -> look at an image u remember it for long time
//		int arr[]= {1,2,3,1,7,5,1,2,3};  //school
//		int arr[]= {1,2,2,1,7,5,1,2,3};  //school
		int arr[]= {1,2,4,5,7,9,3}; 
//		int peakIndex=peakUsingLinearTC(arr); //  O(n)
		int peakIndex1=peakUsingLogTC(arr); //  O(n)
		System.out.println(peakIndex1==-1? "No Peak Found":peakIndex1);
	}

	private static int peakUsingLogTC(int[] arr) {
		//System.out.println(arr.length);
		int start=0;
		int end=arr.length-1;
		
		while(start<end)
		{
			int mid=(start+end)/2;
			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1] )
				return mid;
			else if(arr[mid]> arr[mid-1])
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}

	private static int peakUsingLinearTC(int[] arr) {
		
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]> arr[i-1]  && arr[i]>arr[i+1])
				return i;
		}
		return -1;
	}

}
