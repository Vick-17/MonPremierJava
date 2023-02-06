import java.text.Normalizer;
import java.util.Scanner;
import java.util.Random;


public class decorecteur {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ercrivais in frase cent phaute : ");
        String lessFaute = scan.nextLine();
    }
    public static String cleanString(String cleanStringCharactere){
        cleanStringCharactere = Normalizer.normalize(cleanStringCharactere, Normalizer.Form.NFD);
        String outpout = cleanStringCharactere.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        outpout = outpout.replaceAll("[^a-zA-Z]+", "");
        return outpout;
    }
    public static void placeAlea (char[] lettres, char[] [] tab) {
        Random r=new Random();
        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < (tab.length)-1; j++)
                tab [i] [j]=lettres[((char)Math.random())*tab.length];
    }
}
