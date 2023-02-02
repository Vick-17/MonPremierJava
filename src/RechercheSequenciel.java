import java.util.Scanner;

/**
 * The type Recherche sequenciel.
 */
public class RechercheSequenciel {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] n = {1,2,3,4,5,6,7,8,9};
        System.out.println("Marquer un nombre ");
        int demande = scan.nextInt();
        boolean dansLaListe = false;

        for (int i : n){
            if (i == demande){
                dansLaListe = true;
                break;
            }
        }
        System.out.println(dansLaListe);
    }
}
