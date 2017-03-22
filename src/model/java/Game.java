package model.java;

public class Game
{
	private int wins = 0;
    private int losses = 0;
    private int ties = 0;

    public static enum GameOutcome{
        WIN, LOSE, TIE;
    }

    public GameOutcome getGameOutcome(String userChoice, String computerChoice){

        if(userChoice.equalsIgnoreCase("F")){

            if(computerChoice.equalsIgnoreCase("C")){
                losses++;
                return GameOutcome.LOSE;
            }
            else if(computerChoice.equalsIgnoreCase("N")){
                wins++;
                return GameOutcome.WIN;
            }
        }
        else if(userChoice.equalsIgnoreCase("C")){

            if(computerChoice.equalsIgnoreCase("N")){
                
                losses++;
                return GameOutcome.LOSE;
            }
            else if(computerChoice.equalsIgnoreCase("F")){
                
                wins++;
                return GameOutcome.WIN;
            }
        }
        else if(userChoice.equalsIgnoreCase("N")){

            if(computerChoice.equalsIgnoreCase("C")){
                
                losses++;
                return GameOutcome.LOSE;
            }
            else if(computerChoice.equalsIgnoreCase("F")){
                
                wins++;
                return GameOutcome.WIN;
            }
        }
        ties++;
        return GameOutcome.TIE;
    }

    public String getRandomChoice(){
        double RPS = Math.random();

        if(RPS < .33){
            return "F";
        }
        else if(RPS < .66){
            return "C";
        }
        else{
            return "N";
        }
    }

    public int getWins(){
        return wins;
    }

    public int getLosses(){
        return losses;
    }

    public int getTies(){
        return ties;
    }
	
}
