// I maked rock paper scissors game .........

import java.util.Scanner;

import java.util.Random;

public class mygame {
    public static void main(String[] args) {
         
        System.out.println("This is Rock, Paper, Scissor Game >>>>>>");

        Scanner in = new Scanner(System.in);
        Random bot = new Random();

        System.out.println("Choose any one - 0,1,2 (0:Rock, 1:Paper, 2:Scissors) : ");
        
        int user_input = in.nextInt();
        int bot_input = bot.nextInt(3);

        switch (user_input) {
            case 0 : System.out.println("You choose Rock");
            break;
            case 1 : System.out.println("You choose Paper");
            break;
            default : System.out.println("You choose Scissors");
            break;
        }

        switch (bot_input) {
            case 0 : System.out.println("Comouter choose Rock");
            break;
            case 1 : System.out.println("Comouter choose Paper");
            break;
            default : System.out.println("Comouter choose Scissors");
            break;
        }

        if (user_input == bot_input){
            System.out.println("It's tie. ");
        }
        else if  (bot_input == 1 && user_input==0){
            System.out.println("You lose.");
        }
        else if (bot_input==2 && user_input==1) {
            System.out.println("You lose.");
        }
        else if (bot_input==0 && user_input==2) {
            System.out.println("You lose.");
        }
        else if  (user_input==0 && bot_input==2){
            System.out.println("You Win.");
        }
        else if (user_input==2 && bot_input==1) {
            System.out.println("You Win.");
        }
        else if (user_input==1 && bot_input==0) {
            System.out.println("You Win.");
        }
        else {
            System.out.println("You choose wrong option.");
        }
    }
}
