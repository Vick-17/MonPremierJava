import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class tesRegexx {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Marque une phrase");
            // La chaîne de caractères à analyser
            String input = scan.nextLine();
            int maj = 0;
            // L'expression régulière pour correspondre à tout caractère qui n'est pas un chiffre ou une lettre
            String pattern = "[A-Z]";
            // Compilation de l'expression régulière en un objet Pattern
            Pattern p = Pattern.compile(pattern);
            // Création d'un objet Matcher qui sera utilisé pour trouver des correspondances dans la chaîne de caractères
            Matcher m = p.matcher(input);
            // Boucle pour trouver toutes les correspondances
            while (m.find()) {
                maj++;
                // Affichage du caractère qui n'est pas un chiffre ou une lettre
                System.out.println("Non-word character: " + m.group());
            }
            System.out.println("Il y du coup : " + maj + " maj ");
        }
}
