import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VerifCarte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mettre votre carte de credit : ");
        long carte = scan.nextLong();
        int[] tabTrier = ennumNombre(carte);
        System.out.println(Arrays.toString(tabTrier));

    }

    public static int[] ennumNombre(long number) {
        ArrayList<Integer> digits = new ArrayList<>();

        while (number > 0) {
            int digit = (int) (number % 10);
            digits.add(digit);
            number /= 10;
        }

        int[] tabTrier = new int[digits.size()];
        for (int i = 0; i < tabTrier.length; i++) {
            tabTrier[i] = digits.get(tabTrier.length - i - 1);
        }

        return tabTrier;
    }
}
