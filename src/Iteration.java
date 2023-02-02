import java.util.Scanner;

/**
 * The type Iteration.
 */
public class Iteration {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] n = {1,2,3,4,5,6,7,8,9};
        for (int i : n){
            System.out.println(i);
        }
    }
}
