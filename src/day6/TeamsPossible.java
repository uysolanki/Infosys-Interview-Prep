package day6;

import java.util.Arrays;

public class TeamsPossible {

	public static void main(String[] args) {
		int players[]= {5,4,3,6};
		int n=3;
		int maxTeams=auction(players,n);
		System.out.println(maxTeams);
	}

	private static int auction(int[] players, int n) {
		
		int start=0;													//start=0
		int end=Arrays.stream(players).sum();							//end=18
		
		while(start<=end)
		{
			int mid=(start+end)/2;										//mid=9
			
			if(checkTeamsPossible(mid,players,n))
			{
				if(checkTeamsPossible(mid+1,players,n))
				{
					start=mid+1;
				}
				else
				{
					return mid;
				}
				
			}
			else
			{
				end=mid-1;
			}
		}
		return 0;
	}	//														 {5,4,3,6};
		//											4										4
	private static boolean checkTeamsPossible(int numberOfTeams, int[] players, int numberOfPlayerPerTeam) {
		
		int totalPlayersNeeded=numberOfTeams*numberOfPlayerPerTeam; //12
		
		int avilablePlayers=0;  //3,6,9,12
		for(int p:players)
		{
			avilablePlayers+= Math.min(numberOfTeams, p);
		}
			
		if(avilablePlayers>=totalPlayersNeeded)
			return true;
		else
			return false;
				
	}

	

}



//start										mid									end
//0											3									3