import java.util.Scanner;

/**
 * The type Fizz buzz.
 */
public class FizzBuzz {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer un nombre : ");
        int n = scan.nextInt();
            for (int i = 1; i <=n; i++){
                if ( i%3 == 0 && i%5 == 0) {
                    System.out.println(i);
                } else if (i%3 == 0) {
                    System.out.println("Fizz");
                } else if (i%5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
    }
}

