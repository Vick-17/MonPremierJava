public class dDiag {
    public static void main(String[] args){
        int[][] array2D = {{4,6,5,10,7}, {7,11,34,50,31}, {28, 6, 2,69,78}, {1,2,3,15,95}, {4,3,10,90,17}};
        int total = 0;
        int total2 = 0;
        int height = 4;
        for(int i = 0; i<array2D.length; i++){
            total += array2D[i][i];
        }
        for(int i = 0; i<array2D.length; i++){
            total2 += array2D[i][height-i];
        }
        System.out.println(total);
        System.out.println(total2);
    }
}
