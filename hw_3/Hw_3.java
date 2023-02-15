package hw_4;

public class Hw_4 {

    static int countWays(int x, int y, int M) {
        if (x == M - 1 && y == M - 1) {
            return 1;
        }
        if (x > M - 1 || y > M - 1) {
            return 0;
        }
        return countWays(x + 1, y, M) + countWays(x, y + 1, M);
    }

    public static void main(String[] args) {
        int result = countWays(2, 1, 6);
        System.out.println(result);
    }
}