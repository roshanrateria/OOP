public class Matrix {
    public static void main(String[] args) {
        int[][] matrixA = { {1, 2, 3}, {4, 5, 6} };
        int[][] matrixB = { {7, 8, 9}, {10, 11, 12} };

        int[][] sum = MatrixOperations.add(matrixA, matrixB);
        int[][] difference = MatrixOperations.subtract(matrixA, matrixB);
        int[][] product = MatrixOperations.multiply(matrixA, matrixB);

        // Print the results
        System.out.println("Sum:");
        printMatrix(sum);
        System.out.println("\nDifference:");
        printMatrix(difference);
        System.out.println("\nProduct:");
        printMatrix(product);
    }

    // Helper method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
public class MatrixOperations {
    // Method to add two matrices
    public static int[][] add(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to subtract one matrix from another
    public static int[][] subtract(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiply(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}
