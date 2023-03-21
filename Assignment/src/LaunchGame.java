import java.util.Scanner;

class Guesser
{
    int guessNum;
    int guesser()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Guesser kindly guess the number between 1-50");
        guessNum=in.nextInt();
        if(guessNum<=50)
        {
        }
        else
        {
            System.out.println("Number is out of given bound----");
            System.exit(0);
        }
        return guessNum;
    }
}
class Player
{
    int guessNum;
    int player()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Player kindly guess the number between 1-50");
        guessNum=in.nextInt();
        if(guessNum<=50)
        {
        }
        else
        {
            System.out.println("Number is out of bounds----");
            System.exit(0);
        }
        return guessNum;
    }
}

class Umpire {
    int guessNumber;
    int player1Number;
    int player2Number;
    int player3Number;

    void collectFromGuesser() {
        Guesser g = new Guesser();
        guessNumber = g.guesser();
    }

    void collectFromPlayer() {
        Player p = new Player();
        player1Number = p.player();
        player2Number = p.player();
        player3Number = p.player();
    }

    void compare() {
        Guesser g = new Guesser();
        Player p = new Player();
        if (guessNumber == player1Number)
        {
            if(guessNumber==player2Number && guessNumber==player3Number)
            {
                System.out.println("All the players won the game");
            }
            else if(guessNumber==player2Number)
            {
                System.out.println();
                System.out.println("Game tied between Player 1 and Player 2");
                System.out.println();
                System.out.println("Round 2");
                guessNumber=g.guesser();
                System.out.println("Player 1 and Player 2 guess the number");
                player1Number=p.player();
                player2Number=p.player();
                if(guessNumber==player1Number)
                {
                    if(guessNumber==player2Number)
                    {
                        System.out.println("Player 1 and Player 2 both have won the game");
                    }
                    else
                    {
                        System.out.println("Player 1 has won the game");
                    }
                }
                else if(guessNumber==player2Number)
                {
                    System.out.println("Player 2 has won the game");
                }
                else
                {
                    System.out.println("Game lost");
                }
            }
            else if(guessNumber==player3Number)
            {
                System.out.println();
                System.out.println("Game tied between Player 1 and Player 3");
                System.out.println();
                System.out.println("Round 2");
                guessNumber=g.guesser();
                System.out.println("Player 1 and Player 3 guess the number");
                player1Number=p.player();
                player3Number=p.player();
                if(guessNumber==player1Number)
                {
                    if(guessNumber==player3Number)
                    {
                        System.out.println("Player 1 and Player 3 both have won the game");
                    }
                    else
                    {
                        System.out.println("Player 1 has won the game");
                    }
                }
                else if(guessNumber==player3Number)
                {
                    System.out.println("Player 3 has won the game");
                }
                else
                {
                    System.out.println("Game lost");
                }
            }
            else
            {
                System.out.println("Player 1 has won the game");
            }
        }
        else if(guessNumber==player2Number)
        {
            if(guessNumber==player3Number)
            {
                System.out.println();
                System.out.println("Game tied between Player 2 and Player 3");
                System.out.println();
                System.out.println("Round 2");
                guessNumber=g.guesser();
                System.out.println("Player 2 and Player 3 guess the number");
                player2Number=p.player();
                player3Number=p.player();
                if(guessNumber==player2Number)
                {
                    if(guessNumber==player3Number)
                    {
                        System.out.println("Player 2 and Player 3 both have won the game");
                    }
                    else
                    {
                        System.out.println("Player 2 has won the game");
                    }
                }
                else if(guessNumber==player3Number)
                {
                    System.out.println("Player 3 has won the game");
                }
                else
                {
                    System.out.println("Game lost");
                }
            }
            else
            {
                System.out.println("Player 2 has won the game");
            }
        }
        else if(guessNumber==player3Number)
        {
            System.out.println("Player 3 has won the game");
        }
        else
        {
            System.out.println("Game Lost");
        }

    }
}
public class LaunchGame
{
    public static void main(String[] args)
    {
        System.out.println("             GUESSER GAME \n            Enter to begin");
        Scanner in=new Scanner(System.in);
        in.nextLine();
        Umpire u=new Umpire();
        u.collectFromGuesser();
        u.collectFromPlayer();
        u.compare();
    }
}
