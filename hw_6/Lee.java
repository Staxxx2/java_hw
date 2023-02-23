import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Arrays;

class unit {
    int x, y, distance;

    unit(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.distance = dist;
    }
}

public class Lee {

    static int M = 13;
    static int N = 13;

    static boolean isValid(int mat[][], boolean visited[][], int row, int col) {
        return ((row >= 0) && (row < M)) && ((col >= 0) && (col < N)) && (mat[row][col] == 1) && (!visited[row][col]);
    }

    private static void calculate(int matrix[][], int i, int j, int x, int y, int[][] matrixFinal) {
        int row[] = { 0, 0, 0, 1 };
        int col[] = { 0, 0, 1, 0 };

        boolean[][] visited = new boolean[M][N];
        Queue<unit> q = new LinkedList<unit>();
        visited[i][j] = true;
        q.add(new unit(i, j, 0));
        int min_distance = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            unit unit = q.poll();

            i = unit.x;
            j = unit.y;
            int dist = unit.distance;
            matrixNew(i, j, dist, matrixFinal);
            if (i == x && j == y) {
                min_distance = dist;
                break;
            }

            for (int k = 0; k < 4; k++) {
                if (isValid(matrix, visited, i + row[k], j + col[k])) {
                    visited[i + row[k]][j + col[k]] = true;
                    unit n = new unit(i + row[k], j + col[k], dist + 1);
                    q.add(n);
                }
            }
        }

        if (min_distance == Integer.MAX_VALUE) {
            System.out.print("Контрольная точка не достигнута"+ "\n");
        } else {
            System.out.print("Самый быстрый путь = " + min_distance + "\n");
        }
    }

    public static void matrixNew(int i, int j, int dist, int[][] matrixFinal) {

        matrixFinal[i][j] = dist;

    }

    public static void main(String[] args) {
        int xin, yin, xout, yout;
        int[][] matrix = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
                { 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0 },
                { 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0 },
                { 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0 },
                { 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0 },
                { 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0 },
                { 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0 },
                { 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0 },
                { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0 },
                { 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0 },
                { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };
        System.out.printf("Добро пожаловать в лабиринт"+"\n");
        printmatrix(matrix);
        int[][] matrixFinal = matrix;
        int[] coord = getcoordinats();
        calculate(matrix, coord[0], coord[1], coord[2], coord[3], matrixFinal);
        printmatrix(matrixFinal);
    }

    public static int[] getcoordinats()
    {
        System.out.printf("Введите координаты, значения 0 > (Х и Y) < 13 "+"\n");
         Scanner iScanner = new Scanner(System.in);
                System.out.printf("X входа: ");
                int xin = Integer.parseInt(iScanner.nextLine()); 
                System.out.printf("Y входа: ");
                int yin = Integer.parseInt(iScanner.nextLine());
                System.out.printf("X выхода: ");
                int xout = Integer.parseInt(iScanner.nextLine());
                System.out.printf("Y выхода: ");
                int yout = Integer.parseInt(iScanner.nextLine());
                iScanner.close();  
                return new int[] { xin, yin, xout, yout };
    }

    
    static void printmatrix(int[][] matrix) {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    System.out.print("▒" + " ");
                } else {
                    if (matrix[i][j] < 10) {
                        System.out.print(matrix[i][j] + " ");
                    } else {
                        System.out.print(matrix[i][j]);
                    }

                }

            }
            System.out.println();
        }
    }

}