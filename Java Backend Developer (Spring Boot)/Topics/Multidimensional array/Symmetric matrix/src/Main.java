import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = reader.nextInt();
            }
        }
        boolean symmetric = true;
        int rev = -1;
        for (int i = 0; i < n / 2; i++) {
            rev = n - 1 - i;
            if (matrix[i][i] != matrix[rev][rev]) {
                symmetric = false;
                break;
            }
        }
        if (symmetric) System.out.println("YES");
        else System.out.println("NO");
    }
}