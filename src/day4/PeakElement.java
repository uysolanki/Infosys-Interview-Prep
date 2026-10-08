package day4;

public class PeakElement {

	public static void main(String[] args) {
		//int arr[]= {1,2,3,1};
		//int arr[]= {1,2,1,1,2,3,4};
		int arr[]= {1,1,1,1,2,3,4};
		int peak=findPeak(arr);
		System.out.println(peak==-1?"No Peak found":peak);
	}

	private static int findPeak(int[] arr) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end)
		{
			int mid=(start+end)/2;
			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
				return mid;
			else if(arr[mid]>arr[mid-1])
				start=mid+1;
			else
				end=mid-1;
				
		}
		return -1;
	}

}
