import java.io.IOException;
import java.lang.StringBuilder;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word > ");
        String word = scanner.nextLine();


        StringBuilder input = new StringBuilder();

        // append a string into StringBuilder
        input.append(word);

        // reverse StringBuilder
        input = input.reverse();

        System.out.println(word);

        // print reversed String
        System.out.println(input);

        if (input.toString().equals(word.toString())) {
            System.out.println("The word " + word + " is a palindrome");
        } else {
            System.out.println("The word " + word + " is not a palindrome");
        }


    }
}
