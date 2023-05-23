import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ProgrammingHistory {
  public static void main(String[] args) {

    // This method copies each line into its own element of an ArrayList
    ArrayList<String> lines = new ArrayList<String>();
    try {
      File file = new File("ProgrammingHistory.txt");
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        lines.add(line);
      }
      scanner.close();
    } 
    catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
    
    // This method searches for a word in the entire text
    // It will return every index position of the arraylist that the word is in
    try (
        Scanner input = new Scanner(System.in)) {
      System.out.print("Enter a word to search for: ");
      String word = input.nextLine();
      ArrayList<Integer> indexes = searchWord(lines, word);

      // The program counts how many times the word is found and includes the line number where the word is found
      int count = indexes.size();
      System.out.printf("The word '%s' appears %d times.%n", word, count);
      if (count > 0) {
        System.out.println("It appears at these indexes: " + indexes);
      }
    }
  }


  // requires: the word the program is looking for and the lines
  // modifies: nothing
  // effects: returns a formatted string with lines that contain the inputted word
  public static ArrayList<Integer> searchWord(ArrayList<String> lines, String word) {
    ArrayList<Integer> indexes = new ArrayList<Integer>();
    int lineNumber = 1;
    // this loops through the lines of the text and adds to the end of each result
    for (int i = 0; i < lines.size(); i++) {
      String line = lines.get(i);
      if (line.contains(word)) {
        indexes.add(i);
        System.out.println("Line " + lineNumber + ": " + line);
      }
      lineNumber++;
    }
    return indexes;
  }
}
