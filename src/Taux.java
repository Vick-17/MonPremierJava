import java.util.Scanner;
public class Taux {
    public static void main(String[] args) {
        System.out.println("Célibataire");
        Scanner scan = new Scanner(System.in);
        String demandecelib = scan.next();
        System.out.println("Combient d'enfant ?");
        int NbrEnfant = scan.nextInt();
        System.out.println("Qu'elle est vrotre salaire ?");
        int Salaire = scan.nextInt();
        int taux = 25;
        if(demandecelib.equals("oui")){
            taux = 20;
        }
        if(Salaire < 1800){
            taux = taux + 10;
        }
        taux = taux + (15 * NbrEnfant);
        if(taux > 50){
            taux = 50;
        }
        System.out.println("Votre taux est de " + taux + "%");
    }
}
