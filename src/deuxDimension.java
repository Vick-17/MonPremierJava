
public class deuxDimension {
    public static void main(String[] args){
        int[][] array2D = {{4,6,5}, {7,11,34}, {28, 6, 2}, {1,2,3}, {4,3,10}};
        int total = 0;
        for (int[] ints : array2D) {
            for (int anInt : ints) {
                total += anInt;
            }
        }
        System.out.println(total);
    }
}
