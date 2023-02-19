import java.util.LinkedList;
import java.util.Queue;

class unit {
    int x, y, distance;

    unit(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.distance = dist;
    }
}

public class Lee {
    // длинна и ширина матрицы
    static int M = 13;
    static int N = 13;

    static boolean isValid(int mat[][], boolean visited[][], int row, int col) {
        return ((row >= 0) && (row < M)) && ((col >= 0) && (col < N)) && (mat[row][col] == 1) && (!visited[row][col]);
    }

    private static void calculate(int matrix[][], int i, int j, int x, int y) {
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
            System.out.print("Контрольная точка не достигнута");
        } else {
            System.out.print("Самый быстрый путь = " + min_distance);
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                    { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1 },
                    { 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1 },
                    { 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1 },
                    { 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1 },
                    { 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
                    { 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
                    { 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1 },
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
            };

        printmatrix(matrix);
        calculate(matrix, 0, 0, 3, 4);
    }

 static void printmatrix(int[][] matrix){
        for (int i = 0; i < 13; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " "); 
			}
			System.out.println();
		}
    }


}