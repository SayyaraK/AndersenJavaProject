public class DiagonalArrayCreator {
    public static int[][] createDiagonalArray(int size) {
        int[][] array = new int[size][size];


        for (int i = 0; i < size; i++) {
            array[i][i] = 1;  // Main diagonal
        }

        return array;
    }

    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
