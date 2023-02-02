import java.util.Scanner;

/**
 * The type Somme index.
 */
public class SommeIndex {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] n = {1,5,3,6,4};
        System.out.println("Entrer i :");
        int i = scan.nextInt();
        System.out.println("Entrer j :");
        int j = scan.nextInt();
        int total = 0;
        for(int x = i; x<j; x++){
            total += n[x+1];
        }
        System.out.println(total);
    }
}
