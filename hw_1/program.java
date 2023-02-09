
public class program {
    static int triangle(int n) {

        if (n == 1)
            return 1;
        else
            return (n + triangle(n - 1));
    }

    public static void main(String[] args) {
        int result = triangle(5);
        System.out.println(result);
    }
}
