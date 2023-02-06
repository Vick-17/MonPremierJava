import java.text.Normalizer;
import java.util.Scanner;

public class DiscordBot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String stringClean = cleanString(message);
        String response = onMessageRecu(stringClean);
        System.out.println(response);
    }
    public static String onMessageRecu(String event) {
        if (event.endsWith("quoi")) {
            return "feur";
        } else {
            return "";
        }
    }

    public static String cleanString(String cleanStringCharactere){
        cleanStringCharactere = Normalizer.normalize(cleanStringCharactere, Normalizer.Form.NFD);
        String outpout = cleanStringCharactere.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        outpout = outpout.replaceAll("[^a-zA-Z]+", "");
        return outpout;
    }
}