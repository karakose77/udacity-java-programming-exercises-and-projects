
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

    // main() method - entry point to start execution
    public static void main(String[] args) {

        // invoke to count & print for supplied file
        countAndPrintLineWord("warOfTheWorldsWells.txt");
    }

    /**
     * this method count & prints number of lines & words in a text file
     * 
     * @param fileName
     */
    public static void countAndPrintLineWord(String fileName) {

        // local variables
        BufferedReader bufferedReader = null;
        String line = "";
        int lineCount = 0;
        int wordCount = 0;

        // Step 1: Read file from local drive location
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));

            // Step 2: Read line from file
            while ((line = bufferedReader.readLine()) != null) {

                // increase line count by 1
                lineCount++;

                // Step 3: split line using space as delimiter
                String[] words = line.split(" ");

                // Step 4 & 5: add word count length
                wordCount += words.length;
            }

            // Step 6: print the count value of line & word
            System.out.println("Number of lines is : " + lineCount);
            System.out.println("Number of words is : " + wordCount);
        } catch (FileNotFoundException fnfex) {
            fnfex.printStackTrace();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        } finally {

            // close resources, if any
            try {
                if (null != bufferedReader) {
                    bufferedReader.close();
                }
            } catch (IOException ioex) {
                ioex.printStackTrace();
            }
        }
    }
}