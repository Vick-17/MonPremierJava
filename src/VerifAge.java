import java.util.Scanner;
import java.util.Date;

public class VerifAge {
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
