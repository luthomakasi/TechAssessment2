import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of words separated by space:");
        String input = scanner.nextLine();
        String[] wordArray = input.split("\\s+");

        findLongest(wordArray);

        scanner.close();
    }

    public static void findLongest(String[] words) {
        if (words == null || words.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);
    }
}

