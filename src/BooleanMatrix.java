import java.util.Scanner;

public class BooleanMatrix {

    static void BooleanMatrixProblem(int[][] mat, int m, int n) {
        boolean[] rowHasOne = new boolean[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    rowHasOne[i] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            if (rowHasOne[i]) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        BooleanMatrixProblem(mat, m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
