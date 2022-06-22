import java.util.Scanner;
import java.util.Random;
public class BookCricketGame{
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome To BookCricketGame");
        System.out.println("Rules for the Game :");
        System.out.println("** Assume a book of 300 pages **");
        System.out.println("1. Player 1 opens the book to read a page number (Randomly generated)");
        System.out.println("2. Total score of a player = page number % 7 (number % 7 will always be between 0 - 6)");
        System.out.println("3. Player 1 continues and keeps adding to the score untill page number results in a 0 score");
        System.out.println("4. Player 2 starts the game and tries to beat the score of player 1");
        System.out.println("5. In case of a tie, check the number of turns(player with lesser turns is winner)");
        System.out.println("6. Show the winner of the game.");
        while(true){
        System.out.print("Enter 1 to Start Game And 0 for Exit: ");
        int decision=scan.nextInt();

        if(decision!=1){
             System.out.println("You are now Exit.");
             System.exit(0);
            }

        
        Random r=new Random();
        scan.nextLine();
        System.out.print("Enter Player 1 Name: ");
        String player1=scan.nextLine();
        System.out.print("Enter Player 2 Name: ");
        String player2=scan.nextLine();

        
        int turns1=0,turns2=0,score1=0,score2=0,winner=0;
        int pages1=r.nextInt(300);
        int pages2=r.nextInt(300);

        System.out.println("Player : "+player1);
        System.out.print("Enter 1 to Open Book :");
        int status=scan.nextInt();
        int points=0;

        while(pages1%7!=0){
            points=pages1%7;
            score1+=points;
            System.out.println("Page Number : "+pages1+"    Points : "+points+"     Score : "+score1);
            turns1++;
            pages1=r.nextInt(300);
            System.out.print("Enter 1 to Open Book :");
            status=scan.nextInt();
        }

        System.out.println("!!!         OOPS        !!!");
        System.out.println("Page Number : "+pages1+"    Points : 0     Score : "+score1);
        System.out.println(player1+" Total Score : "+score1);
        System.out.println(player1+" Takes "+turns1+" Rounds");
        System.out.println("Player : "+player2);

        int maxturns=turns1;
        System.out.print("Enter 1 to Open Book :");
        status=scan.nextInt();

        while(maxturns--!=0 && score2<=score1){
            points=pages2%7;
            score2+=pages2%7;
            System.out.println("Page Number : "+pages2+"    Points : "+points+"     Score : "+score2);
            turns2++;
            pages2=r.nextInt(300);
            System.out.print("Enter 1 to Open Book :");
            status=scan.nextInt();
        }

        System.out.println("Page Number : "+pages2+"    Points : 0     Score : "+score2);
        System.out.print("Results :");

        if(score1==score2){
            if(turns1==turns2)
                System.out.println("No Winner.");
              else if(turns1>turns2)
                     System.out.println(player2+" won the Match By "+turns2 +"Rounds.");
                else
                     System.out.println(player1+" won the Match By "+turns1 +"Rounds.");
        }else{
            if(score1>score2)
               System.out.println(player1+" won the Match By "+(score1-score2)+" Points.");
              else 
                System.out.println(player2+" won the Match By "+(score2-score1)+" Points.");
        }
        }
    } 
}
