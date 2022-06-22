import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Game {
    public int Game() {

        int x = 1 + (int) (Math.random() * 10);
        return x;


    }

    public int takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int userInput = sc.nextInt();
        return userInput;

    }

    public void isCorrectInput(int a, int b) {
        int diff = a - b;   // user - random


        if (a == b) {
            System.out.println("your answer is correct");
        } else if (diff > 0 && diff < 2) {
            System.out.println("you are close, try a bit smaller digit.");
        } else if (diff < 0 && diff > -2) {
            System.out.println("you are close, try a bit larger digit");


        } else {
            System.out.println("try again");

        }
    }
}


class guessTheNumber{
    public static void main(String[] args){

        /*
        create a class Game which allows user to play "guess the number"
        game once. Game should have the following methods:
        1. constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is correct
        4. getter and setter for noOfGuesses
        Use properties such as noOfGuesses (int), etc.
         */

Game player = new Game();
int y = player.Game();

int turns = 0;
for(int i=0; i<10; i++) {
    int x = player.takeUserInput();
    player.isCorrectInput(x, y);
    if(y == x){break;}
    turns ++;
}
        System.out.println();
        System.out.println("RESULT");
        System.out.println("Your total lives wasted is equal to " + turns);
        System.out.println("Your score is " + (10-turns));
    }
}