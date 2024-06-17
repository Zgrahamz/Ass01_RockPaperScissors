import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String aMove = "";
        String bMove = "";
        String pAgain = "";
        boolean isDone = false;
        boolean gameDone = false;

        do {
            do {
                System.out.println("Player A, choose your move: r, p, or s: ");
                if(sca.hasNext()) {
                    aMove = sca.nextLine();
                    if(aMove.equalsIgnoreCase("r") || aMove.equalsIgnoreCase("p") || aMove.equalsIgnoreCase("s")) {
                        System.out.println("Player A chooses " + aMove);
                        isDone = true;
                    } else {
                        System.out.println("Not a valid input. Please enter r, p, or s.");
                    }
                } else {
                    System.out.println("Not a valid input. Please enter r, p, or s.");
                }
            } while (!isDone);

            isDone = false;

            do {
                System.out.println("Player B, choose your move: r, p, or s: ");
                if(sca.hasNext()) {
                    bMove = sca.nextLine();
                    if(bMove.equalsIgnoreCase("r") || bMove.equalsIgnoreCase("p") || bMove.equalsIgnoreCase("s")) {
                        System.out.println("Player B chooses " + bMove);
                        isDone = true;
                    } else {
                        System.out.println("Not a valid input. Please enter r, p, or s.");
                    }
                } else {
                    System.out.println("Not a valid input. Please enter r, p, or s.");
                }
            } while (!isDone);

            if(aMove.equalsIgnoreCase("r") && bMove.equalsIgnoreCase("p")) {
                System.out.println("Paper covers rock. Player b wins!");
            } else if(aMove.equalsIgnoreCase("p") && bMove.equalsIgnoreCase("r")) {
                System.out.println("Paper covers rock. Player a wins!");
            }

            if(aMove.equalsIgnoreCase("s") && bMove.equalsIgnoreCase("r")) {
                System.out.println("Rock breaks scissors. Player b wins!");
            } else if(aMove.equalsIgnoreCase("r") && bMove.equalsIgnoreCase("s")) {
                System.out.println("Rock breaks scissors. Player a wins!");
            }

            if(aMove.equalsIgnoreCase("p") && bMove.equalsIgnoreCase("s")) {
                System.out.println("Scissors cut paper. Player b wins!");
            } else if(aMove.equalsIgnoreCase("s") && bMove.equalsIgnoreCase("p")) {
                System.out.println("Scissors cut paper. Player a wins!");
            }

            System.out.println("Play again? [Y/N]");
            pAgain = sca.nextLine();
            if(pAgain.equalsIgnoreCase("n")) {
                gameDone = true;
            }
        } while (!gameDone);
    }
}