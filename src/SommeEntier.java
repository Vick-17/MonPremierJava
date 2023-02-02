import java.util.Scanner;

/**
 * The type Somme entier.
 */
public class SommeEntier {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer un entier : ");
        int n = scan.nextInt();
        int base = 0;
        for (int i = 0; i <= n; i++){
            base += i;
        }
        System.out.println("La somme des entiers de 0 à " + n + " est " + base);
    }
}
