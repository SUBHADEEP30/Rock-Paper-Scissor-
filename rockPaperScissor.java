import java.util.*;
import java.util.Random;

public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // u and c is used for storing user and computer points
        int u = 0, c = 0;
        System.out.println("LET'S START THE GAME.....\n");
        System.out.println("HOW MANY MATCHES YOU WANT TO PLAY\n");
        // Input for number of matchs
        int matchs = sc.nextInt();
        System.out.println("\nEnter Your Choice");
        System.out.println("\n 0-> FOR ROCK \n 1-> FOR PAPER \n 2-> FOR SCISSOR\n");
        Random rn = new Random();
        for (int i = 1; i <= matchs; i++) {
            System.out.println("MATCH NO." + i);
            System.out.println("\nYour chance");
            int uin = sc.nextInt();
            System.out.println("Computer chance");
            int cran = rn.nextInt(3);// random bound is 3
            System.out.println(cran);
            System.out.println(" ");
            // Comparing two inputs
            switch (cran) {
                // First case for Rock
                case 0:
                    switch (uin) {
                        case 0:
                            System.out.println("THE MATCH IS TIE\n");
                            break;
                        case 1:
                            System.out.println("CONGRATS..! YOU WON THIS ROUND...!\n");
                            u++;
                            break;
                        case 2:
                            System.out.println("COMPUTER WON THIS ROUND...!\n");
                            c++;
                            break;
                        default:
                            System.out.println("SORRY INVALID CHOICE...!\n");
                            i--;
                    }
                    break;
                // Second case for paper
                case 1:
                    switch (uin) {
                        case 0:
                            System.out.println("COMPUTER WON THIS ROUND...!\n");
                            c++;
                            break;
                        case 1:
                            System.out.println("THE MATCH IS TIE\n");
                            break;
                        case 2:
                            System.out.println("CONGRATS...! YOU WON THIS ROUND....!\n");
                            u++;
                            break;
                        default:
                            System.out.println("SORRY INVALID CHOICE....!\n");
                            i--;
                    }
                    break;
                // Third case for scissor
                case 2:
                    switch (uin) {
                        case 0:
                            System.out.println("CONGRATS...! YOU WON THIS ROUND...!\n");
                            u++;
                            break;
                        case 1:
                            System.out.println("COMPUTER WON THIS ROUND...!\n");
                            c++;
                            break;
                        case 2:
                            System.out.println("THE MATCH IS TIE\n");
                            break;
                        default:
                            System.out.println("SORRY INVALID CHOICE...!\n");
                            i--;
                    }
                    break;
            }
            System.out.println("\n");
        }
        // Displaying the scores
        System.out.println("\n YOUR SCORE IS : " + u);
        System.out.println("COMPUTER SCORE IS : " + c);
        System.out.println(" ");
        // Compare the score and Declearing the Winner
        if (c > u) {
            System.out.println("COMPUTER WINS...!");
        } else if (c == u) {
            System.out.println("THE MATCH IS TIE...!");
        } else {
            System.out.println("CONGRATS...! YOU WON THE MATCH...!");
        }
    }
}