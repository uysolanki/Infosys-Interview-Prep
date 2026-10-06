package day3;

public class CloudBurst {

	public static void main(String[] args) {
//		int clouds[]= {0,0,1,0,0,1,0,0};
//		int clouds[]= {0,1,0,1,0,1,0};
		int clouds[]= {0,1,0,1,0,1,0,1};
		
		if(clouds[clouds.length-1]==1)
			System.out.println("Invalid Input");
		else
			{	
			int minJumps=playGame(clouds);
			System.out.println(minJumps);
			}
	}

	private static int playGame(int[] clouds) {
		
		int position=0;
		int jumpCounter=0;
		
		while(position< clouds.length-1) //  0<7
		{
			//try to jump 2 positions
			if(position+2<clouds.length && clouds[position+2]==0)
				position+=2;
			else
				position+=1;
			
			jumpCounter++;
		}
		return jumpCounter;
	}

}
