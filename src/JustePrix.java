import java.util.Scanner;

public class JustePrix {
    public static void main(String[] args) {
        int prix = (int) (Math.random() * 100);
        System.out.println(prix);

        Scanner scan = new Scanner(System.in);

        int essais = 0;

        while (essais < 10){
            System.out.println("Proposer un prix");
            int proposition = scan.nextInt();
            if (proposition == prix) {
                System.out.println("bravo le prix est bien : " + prix + "tu la trouver en " + essais + " Tentative");
            } else if (proposition < prix) {
                System.out.println("non c'est plus haut, tu est a " + essais + " Tentative sur 10" );
            } else {
                System.out.println("non c'est plus bas, tu est a " + essais + " Tentative sur 10" );
            }
            essais++;
        }
        if (essais == 10) {
            System.out.println("Nul le prix était : " + prix);
        }
    }
}
