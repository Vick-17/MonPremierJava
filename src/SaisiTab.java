import java.util.Scanner;

/**
 * The type Saisi tab.
 */
public class SaisiTab {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Saisir le nombre de notes : ");
        int nbrNote = scan.nextInt();
        double[] notes = new double[nbrNote];
        double total = 0;
        for(int i=0; i < notes.length; i++){
            System.out.print("Entrez la note "+(i+1)+": ");
            notes[i] = scan.nextDouble();
        }
        for (double note : notes) {
            total = total + note;
        }
        double moyenne = total / notes.length;
        System.out.println(moyenne);
    }
}
