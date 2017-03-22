package controller.java;

import java.util.Scanner;
import model.java.*;

public class RPSController
{
	public void start()
	{
		System.out.println("Welcome to Foot, Cockroach, Nuke!\n");
		System.out.println("Foot beats Cockroach and loses to Nuke.");
		System.out.println("Cockroach beats Nuke and loses to Foot.");
		System.out.println("Nuke beats Foot and loses to Cockroach.\n");
		System.out.println("Press F for Foot, C for Cockroach, or N for Nuke\n");
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Foot, Cockraoch, Nuke... shoot! (Type F, C, or N)");
        String playerChoice = scanner.next().toUpperCase();

		
		while(!playerChoice.equals("end"))
		{
			Game model = new Game();

	        
	        String computerChoice = model.getRandomChoice();

	        System.out.println("You chose " + playerChoice + ".");
	        System.out.println("The computer chose " + computerChoice + ".");

	        Game.GameOutcome outcome = model.getGameOutcome(playerChoice, computerChoice);

	        if(outcome == Game.GameOutcome.WIN)
	        {
	            System.out.println("You won!");
	        }
	        else if(outcome == Game.GameOutcome.LOSE)
	        {
	            System.out.println("The computer won!");
	        }
	        else
	        {
	        	System.out.println("You and the computer tied!");
	        }
			
	        System.out.println("\nPress F for Foot, C for Cockroach, or N for Nuke\n");
			playerChoice = scanner.next().toUpperCase();
	        
		}
		
		scanner.close();
		
	}
	
	
}
