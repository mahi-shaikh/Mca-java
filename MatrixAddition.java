public class MatrixAddition {
public static void main(String[] args) {
int[][] matrix1 = { { 4, 1,10, }, { 3, 4, 9 }, { 7, 5, 1 } };
int[][] matrix2 = { { 7, 8, 8 }, { 5, 5, 4 }, { 3, 2, 1 } };
int rows = matrix1.length;
int columns = matrix1[0].length;
int[][] resultMatrix = new int[rows][columns];
// Performing matrix addition
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
}
}
// Displaying the result matrix
System.out.println("Resultant Matrix (Matrix1 + Matrix2):");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
System.out.print(resultMatrix[i][j] + " ");
}
System.out.println();
}
}
}