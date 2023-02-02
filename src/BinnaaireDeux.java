import java.util.Scanner;

public class BinnaaireDeux {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez le nombre decimale a passer en base 10 :");
        // On definit le nombre decimal qu'il veut convertire ne base 10
        int decimal = scan.nextInt();
        // On instancit notre variable qui affiche le resulta binaire
        String binary = "";
        // boucle de while pour faire nos division succesif
        do {
            /*on instancit notre variable rest qui mis bout a bout seront notre nombre binaire en faisent
            notre decimal diviser par 2 mais au lieux de recuperer
            le resulta on recupere le reste qui sera 1 ou 0 qui donnera notre nombre binaire,
            2 étant notre base(diviseur)*/
            int rest = decimal % 2;
            /* On update notre chaine de caractère en ajoutant le rest au string,
             mis bout a bout cela nous donne notre nombre bianaire*/
            binary = rest + binary;
            //On update notre nombre décimal en le divisant par 2 afin de ne pas créer une boucle infini
            decimal = decimal / 2;
        } while (decimal > 0);
        System.out.print(binary);
    }
}
