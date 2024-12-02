public class MatrixDebugging {

    public static void main(String[] args) {
        // Paso 1: Crear una matriz 3x3
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Paso 2: Intentar transponer la matriz
        // Intento de transposición de la matriz
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][i] = matrix[i][j]; // Corregido: intercambio de índices
            }
        }

        // Mostrar la matriz transpuesta
        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Paso 3: Intentar acceder a un índice fuera de los límites
        try {
            System.out.println("\nAccediendo al elemento en [2][0]: " + matrix[2][0]); // Último índice válido
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError: " + e.toString());
        }

        // Paso 4: Intentar realizar un cálculo incorrecto con la matriz
        try {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {  // Corregido: Usa < en lugar de <=
                for (int j = 0; j < matrix[i].length; j++) {  // Corregido: Usa < en lugar de <=
                    sum += matrix[i][j];
                }
            }
            System.out.println("\nLa suma de los elementos es: " + sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError al intentar sumar: " + e.toString());
        }
    }
}
