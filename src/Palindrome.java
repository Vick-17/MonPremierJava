import java.text.Normalizer;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("écrivier une phrase : ");
        String palindrome = scan.nextLine();
        int test = 0;
        boolean resultBool = false;

        String output = cleanString(palindrome);

        if(isPalindrome(output)){
            resultBool = true;
        }
        System.out.println( resultBool );
    }
    public static boolean isPalindrome(String verifPalindrome){
        return verifPalindrome.equalsIgnoreCase(new StringBuilder(verifPalindrome).reverse().toString());
    }

    public static String cleanString(String cleanStringCharactere){
        cleanStringCharactere = Normalizer.normalize(cleanStringCharactere, Normalizer.Form.NFD);
        String outpout = cleanStringCharactere.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        outpout = outpout.replaceAll("[^a-zA-Z]+", "");
        return outpout;
    }
}