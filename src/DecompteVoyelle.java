import java.util.Scanner;

public class DecompteVoyelle {
    public static void main(String[] args){
        System.out.print("ecriver");
        Scanner scan = new Scanner(System.in);
        String chaine = scan.nextLine();
        int voyelles = 0;

        for(int i = 0; i<chaine.length(); i++){
            if(isVoyelles(chaine.charAt(i))){
                voyelles++;
            }
        }
        System.out.print("Nombre de voyelles : "+ voyelles);
    }
    public static boolean isVoyelles(char verifVoy){
        if(verifVoy == 'a' || verifVoy== 'e' || verifVoy== 'i' || verifVoy== 'o' || verifVoy== 'u' || verifVoy== 'y'){
            return true;
        }
        return false;
    }
}
