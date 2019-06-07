import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class GuessTheMovie {
    /**
     * Picks a movie randomly from a .txt file. The movie to guess is 
     * represented by a row of dashes, representing each letter of the
     * movie. If the player suggests a letter which occurs in the movie,
     * the computer writes it in all its correct positions and displays
     * it. If the suggested letter does not occur in the movie, the
     * turncount advances one point. The goal is to guess the movie
     * correctly in as few turns as possible.
     * <p>
     */

    public static void main(String[] args) throws FileNotFoundException {
        String filepath = "movies.txt";
        ArrayList<String> movieList = fileIntoList(filepath);
        System.out.println(movieList);
        String chosenMovie = pickMovie(movieList);
        System.out.println(chosenMovie);
        int turnCount = guessTheMovie(chosenMovie);
        System.out.println("You guessed '"  + chosenMovie + "' correctly in " + turnCount + " turns.");        
    }

    public static ArrayList<String> fileIntoList(String filepath) throws FileNotFoundException {
        File file = new File(filepath);
        ArrayList<String> movieList = new ArrayList<String>();
        if (file.exists()) {
            Scanner scanner = new Scanner(file);            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                movieList.add(line);
            }
            scanner.close();
        }
        return movieList;
    }

    public static String pickMovie(ArrayList<String> movieList) {
        int movieListLength = movieList.size();
        int randomNumber = (int) (Math.random() * movieListLength);
        String chosenMovie = movieList.get(randomNumber);
        return chosenMovie;
    }

    public static int guessTheMovie(String chosenMovie) {
        int turnCount = 1;
        int chosenMovieLength = chosenMovie.length();
        String chosenMovieDisplay = "";
        for (int i = 0; i < chosenMovieLength; i++) {
            if (chosenMovie.charAt(i) == ' ') {
                chosenMovieDisplay = chosenMovieDisplay + " ";
            } else {
                chosenMovieDisplay = chosenMovieDisplay + "_";  
            }
        }
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> guessedLetters = new ArrayList<String>();
        while (!chosenMovieDisplay.equals(chosenMovie)) {                       
            System.out.println("You are guessing: " + chosenMovieDisplay);
            System.out.println("Guess a letter(Turn: " + turnCount + "): ");            
            String currentLetter = scanner.nextLine();                          
            if (guessedLetters.contains(currentLetter)) {
                System.out.println("You already guessed that letter!");
                continue;
            } else {
                guessedLetters.add(currentLetter);
            }                      
            if (chosenMovie.contains(currentLetter)) {
                System.out.println("The movie contains that letter!");
                int currentIndex = chosenMovie.indexOf(currentLetter);
                while (currentIndex >= 0) {
                    chosenMovieDisplay = chosenMovieDisplay.substring(0, currentIndex) + 
                                         currentLetter + 
                                         chosenMovieDisplay.substring(currentIndex+1, chosenMovieLength);
                    currentIndex = chosenMovie.indexOf(currentLetter, currentIndex + 1);
                }
            } else {
                System.out.println("The movie does not contain that letter!");
                turnCount++;
                continue;
            }            
        }
        scanner.close();
        return turnCount;        
    }
}
