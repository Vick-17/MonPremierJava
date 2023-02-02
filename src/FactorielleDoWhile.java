import java.util.Scanner;

/**
 * The type Factorielle do while.
 */
public class FactorielleDoWhile {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer un entier : ");
        int n;
        do{
           n = scan.nextInt();
        } while ( n > 12 );

        int base = 1;
        int i = 1;
            do{
                base *= i;
                i++;
            } while( i<=n );
        System.out.println("La factorielle de " + n + " est " + base);
    }
}
