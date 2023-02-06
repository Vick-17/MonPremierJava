import java.text.Normalizer;
import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("écrivier une phrase : ");
        String palindrome = scan.nextLine();
        int test = 0;

        String normalized = Normalizer.normalize(palindrome, Normalizer.Form.NFD);
        String output = normalized.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        output = output.replaceAll("[^a-zA-Z]+", "");
        boolean isPalindrome = output.equalsIgnoreCase(new StringBuilder(output).reverse().toString());
        System.out.println("Output: " + isPalindrome);
    }
}
