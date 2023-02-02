import java.util.Scanner;

public class binnaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre binaire:");
        String binary = scanner.nextLine();
        // definit la variable decimal qui vas étre notre resulat
        int decimal = 0;
        // variable qui prend la valeur des bits
        int powwer = 0;
        // Boucle pour parcourir les chiffres du nombre binaire en partant de la fin
        for (int i = binary.length() - 1; i >= 0; i--) {
            // parcour la boucle et vérifie si le caractère à l'index i est égal à '1'
            if (binary.charAt(i) == '1') {
                // Ajoute la puissance de 2 correspondante au résultat decimal
                decimal += Math.pow(2, powwer);
            }
            // Incrémente le compteur powwer pour suivre la position du bit binaire, 43210 par exemple
            powwer++;
        }
        System.out.println("Le nombre en base 10 est: " + decimal);
    }
}
