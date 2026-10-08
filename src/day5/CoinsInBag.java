package day5;

import java.util.Arrays;

public class CoinsInBag {
	public static void main(String[] args) {
		//int arr[]= {2,17,7,3};
		//int arr[]= {20, 12, 18, 4};
		int arr[]= {1, 1, 1, 1, 10};
		int minCoins=playGame(arr);
		System.out.println(minCoins);
	}
		
		private static int playGame(int[] arr2) {
			int totalMoneyInBag= Arrays.stream(arr2).sum();
			//System.out.println(totalMoneyInBag);
			
			Arrays.sort(arr2);
			//System.out.println(Arrays.toString(arr2));
			
			int moneyInHand=0;
			int coinsInHand=0;
			
			for(int i=arr2.length-1; i>=0; i--)
			{
				 moneyInHand+=arr2[i];
				 coinsInHand++;
				 int remainingMoneyInTheBag = totalMoneyInBag-moneyInHand;
				 
				 if(moneyInHand>remainingMoneyInTheBag)
					 return coinsInHand;
			}
			
			return coinsInHand;
		}
}
