import java.util.Scanner;

public class GuessNumber {
    /**
     * The computer picks a random number between 1 and
     * the given number by the user. Then the user tries 
     * to guess that number.
     * <p>
     */
    
    public static void main(String[] args) {
        int guessCount = guessNumber();

        if (guessCount == 1) {
            System.out.println("Correct! You guessed in " + guessCount + " turn.");
        } else {
            System.out.println("Correct! You guessed in " + guessCount + " turns.");
        }
    }

    public static int guessNumber() {
        boolean guessedNumber = false;
        int guessCount = 0;

        System.out.println("Enter maximum number: ");
        Scanner scanner = new Scanner(System.in);
        int upperLimit = scanner.nextInt();        
        int randomNumber = (int) (Math.random() * upperLimit) + 1;
        System.out.println("Random number is chosen between 1 and " + upperLimit + ".");
        System.out.println("Try to guess it!");
        
        while (guessedNumber == false) {
            guessCount++;            
            System.out.println("Enter your guess(Guess count: " + guessCount + "): ");            
            int currentGuess = scanner.nextInt();            
            if (currentGuess < randomNumber) {
                System.out.println("It is greater than " + currentGuess + ".");
            } else if (currentGuess > randomNumber) {
                System.out.println("It is smaller than " + currentGuess + ".");
            } else {
                guessedNumber = true;                                
            }
        }     
        scanner.close();
        return guessCount;       
    }
}
