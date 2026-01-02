import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int m = reader.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = reader.nextInt();
            }
        }

        // swapping
        int kSwap = reader.nextInt();
        int zSwap = reader.nextInt();
        if (m > 1 && kSwap != zSwap) {
            for (int i = 0; i < n; i++) {
                matrix[i][kSwap] += matrix[i][zSwap];
                matrix[i][zSwap] = matrix[i][kSwap] - matrix[i][zSwap];
                matrix[i][kSwap] = matrix[i][kSwap] - matrix[i][zSwap];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}