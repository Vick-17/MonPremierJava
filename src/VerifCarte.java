import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VerifCarte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mettre votre carte de credit : ");
        long carte = scan.nextLong();
        boolean carteValid = false;
        if(isCardIsValid(String.valueOf(carte))){
            carteValid = true;
            System.out.println("Votre carte est valide");
        } else {
            System.out.println("Votre carte n'est pas valide");
        }

    }

    public static boolean isCardIsValid(String cardNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}
