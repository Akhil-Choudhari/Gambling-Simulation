package GamblingSimulation;

public class GamblingInput {
	static int EveryDayStake=100;
	static int EveryGameStake=1;
	
	public static void main(String[] args) {
	
		System.out.println("Welcome to the Gambling Simulation Game");
		System.out.println("The Gaming bit start with 1 $");
		 
		
			if (Math.random()<0.5) {
				System.out.println("Player Wins");
			}
				else
				System.out.println("Player loose");		
		}
		

	}


