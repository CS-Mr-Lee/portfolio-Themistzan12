public class DiceGame {
public static void main(String[] args) {

    System.out.println("ROLL THE DICE!\n");

    int firstRoll = 1 + (int) (Math.random() * 6);

    int secondRoll = 1 + (int) (Math.random() * 6);

    while (firstRoll != secondRoll) {
        System.out.println("Roll #1: " + firstRoll);
        System.out.println("Roll #2: " + secondRoll);
        int total = firstRoll + secondRoll;
        System.out.println("The total is " + total);
    }
    System.out.println("You rolled doubles!");
    System.out.println("Roll #1: " + firstRoll);
    System.out.println("Roll #2: " + secondRoll);
    int total = firstRoll + secondRoll;
    System.out.println("The total is " + total);
}
}
     
