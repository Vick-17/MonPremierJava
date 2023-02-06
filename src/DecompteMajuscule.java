import java.util.Locale;
import java.util.Scanner;

public class DecompteMajuscule {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Rentrer une phrase avec des majuscule");
        String entrer = scan.nextLine();

        int maj = nbrDeMaj(entrer);

        System.out.print(maj);

    }

    private static int nbrDeMaj(String chaine) {
        int compteur=0;
        for(int i = 0; i<chaine.length(); i++){
            char ch = chaine.charAt(i);
            if(Character.isUpperCase(ch))
                compteur++;
        }
        return compteur;
    }
}
