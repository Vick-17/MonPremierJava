import java.util.Scanner;
import java.util.Date;

/**
 * The type Verif age.
 */
public class VerifAge {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Votre années de naissance : ");
        int naisUt = scan.nextInt();
        Date date = new Date();
        int annee = date.getYear() + 1900;

        if(annee - naisUt >= 18){
            System.out.println("majeur");
        } else {
            System.out.println("Mineur");
        }
    }
}
