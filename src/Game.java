//Ori korngut, 218666568

import java.util.Scanner;
public class Game
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);

        // Get inputs:

        System.out.println("Enter first player's object:");

        char player1 = scan.next().charAt(0);

        System.out.println("Enter second player's object:");

        char player2 = scan.next().charAt(0);

        // Check who won:
        if (player1 == 'S' && player2 == 'S' || player1 == 'R' && player2 == 'R' || player1 == 'P' && player2 == 'P'){
            System.out.println("Player 2 wins.");
        }

        //Checks if player 1 won:
        if (player1 == 'P' && player2 == 'R' || player1 == 'R' && player2 == 'S' || player1 == 'S' && player2 == 'P'){
            System.out.println("Player 1 wins.");
        }

        //Checks if player 2 won:
        if (player2 == 'P' && player1 == 'R' || player2 == 'R' && player1 == 'S' || player2 == 'S' && player1 == 'P'){
            System.out.println("Game ends with a tie.");
        }

    } // end of method main
} //end of class Game