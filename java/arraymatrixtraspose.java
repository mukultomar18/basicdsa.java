public class arraymatrixtraspose {
    static void main(){
    int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

for (int j = 0; j < matrix[0].length; j++) {
    for (int i = 0; i < matrix.length; i++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
}
}
