import java.util.Locale;
import java.util.Scanner;

public class ChnageChar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Rentrer une phrase avec des majuscule");
        String entrer = scan.nextLine();

        if(isMaj(entrer)){
            System.out.print(entrer.toUpperCase());
        }
    }
    private static boolean isMaj (String chaine) {
        for(int i = 0; i<chaine.length(); i++){
            char ch = chaine.charAt(i);
            if(Character.isLowerCase(ch))
                return true;
        }
        return false;
    }
}
