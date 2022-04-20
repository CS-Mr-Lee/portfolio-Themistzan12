import java.util.Scanner;
import java.util.Random;

public class HiLoLimited {
    public static void main(String[] args){
        Random r = new Random(50);
        Scanner keyboard = new Scanner(System.in);
        int guess;
        int randNumber = 1 + r.nextInt(100);
        int maxGuess = 7;
        int tries = 0;
    
    
    System.out.println("I'm thinking of a number between 1-100."
            + " You have 7 guesses.");
    guess = keyboard.nextInt();
            
    while (guess != randNumber && guess > randNumber && tries <= maxGuess){
        ++tries;
        System.out.println("Too high. That was guess number " + tries
                + ". You have " + (maxGuess - tries) 
                + " remaining. Guess again.");
        guess = keyboard.nextInt();

    }
    while (guess != randNumber && guess < randNumber && tries <= maxGuess){
        ++tries;
        System.out.println("Too low. That was guess number " + tries
                + ". You have " + ((maxGuess - tries)) 
                + " remaining. Guess again.");
        guess = keyboard.nextInt();
          
    }
  
    if (guess == randNumber){
        System.out.println("WOW, lucky... You got it! It was in fact " 
            + randNumber + ".");
    }
    else if (tries >= maxGuess){
        System.out.println("You have exhausted your 7 allowed guesses. "
        + "The number was " + randNumber);
    }
    
}
}