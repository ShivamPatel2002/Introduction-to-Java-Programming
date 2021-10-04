/* @author Patel Shivam
    Id = 20CS057

    (Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-paper game.
     (A scissor can cut a paper, a rock can knock a scissor, and a paper canwrap a rock.) The program
     randomly generates a number 0,1, or 2representingscissor, rock, and paper. The program prompts
      the user to enter a number 0,1, or2and displays a message indicating whether the user or the
      computer wins, loses,or draws. Here are sample runs:
 */
package Exercise03;

import java.util.Random;
import java.util.Scanner;

public class Exercise03_17 {

        public static void main(String[] arg) {

            System.out.println("ROCK PAPER & SCISSOR\n\n");
            System.out.println(" IMPORTANT :\n Scissor (0), Rock (1), Paper (2)\n");
            int a = 0;
            int b = 0;


                Scanner sc = new Scanner(System.in);
                System.out.print("Your Turn : ");
                int userchoice = sc.nextInt();

                switch (userchoice) {
                    case 0 -> System.out.println("YOU ARE ROCK");
                    case 1 -> System.out.println("YOU ARE PAPER");
                    case 2 -> System.out.println("YOU ARE SCISSOR");
                    default -> {
                        System.out.println("Invalid Number, Try Again ");
                        userchoice = sc.nextInt();

                    }
                }
                Random r = new Random();
                int CPU = r.nextInt(3);
                switch (CPU) {
                    case 0 -> System.out.println("THE COMPUTER IS ROCK");
                    case 1 -> System.out.println("THE COMPUTER IS PAPER");
                    case 2 -> System.out.println("THE COMPUTER IS SCISSOR");
                }
                if ((userchoice == 0 && CPU == 1) || (userchoice == 1 && CPU == 2) || (userchoice == 2 && CPU == 0)) {
                    System.out.println("CPU WIN\n");
                } else if ((userchoice == 1 && CPU == 0) || (userchoice == 2 && CPU == 1) || (userchoice == 0 && CPU == 2)) {
                    System.out.println("YOU WIN\n");
                } else {
                    System.out.println("IT IS A DRAW\n");
                }

        }
    }
