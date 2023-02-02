import java.util.Scanner;

/**
 * The type Factorielle.
 */
public class Factorielle {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer un entier : ");
        int n = scan.nextInt();
        int base = 1;
        for (int i = 1; i <=n; i++){
            base *= i;
        }
        System.out.println("La factorielle de " + n + " est " + base);
    }
}
