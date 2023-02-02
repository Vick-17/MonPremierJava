import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Saisir le nombre de notes : ");
        int nbrNote = scan.nextInt();
        double[] notes = new double[nbrNote];
        System.out.println(Arrays.toString(notes));
    }
}
