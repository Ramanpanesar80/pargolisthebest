package activities;
import java.util.Arrays;
public class Q62 {
	 public static void main(String[] args) {
	        // Define two 2D matrices
	        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int[][] secondMatrix = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

	        // Print the first and second matrices
	        System.out.println("First matrix: " + Arrays.deepToString(firstMatrix));
	        System.out.println("Second matrix: " + Arrays.deepToString(secondMatrix));

	        // Calculate the sum of the two matrices and print the result
	        int[][] sumMatrix = addMatrices(firstMatrix, secondMatrix);
	        System.out.println("Sum matrix: " + Arrays.deepToString(sumMatrix));
	    }

	    // Method to add two matrices
	    public static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix) {
	        // Get the number of rows and columns in the first matrix
	        int rows = firstMatrix.length;
	        int cols = firstMatrix[0].length;

	        // Check if the two matrices have the same dimensions
	        if (rows != secondMatrix.length || cols != secondMatrix[0].length) {
	            throw new IllegalArgumentException("Both matrices must have the same dimensions.");
	        }

	        // Create a new matrix to store the sum
	        int[][] sumMatrix = new int[rows][cols];

	        // Loop through each element of the matrices and calculate the sum
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
	            }
	        }

	        // Return the resulting sum matrix
	        return sumMatrix;
	    }
}
