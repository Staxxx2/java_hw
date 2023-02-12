import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Homework_two {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("input.txt");
        Scanner scan = new Scanner(fr);
        int a = Character.digit(scan.nextLine().charAt(2), 10);
        int b = Character.digit(scan.nextLine().charAt(2), 10);
        System.out.printf("Число " + a + " в c степени " + b + " равно : %.0f \n", Math.pow(a, b));
        String str = Double.toString(Math.pow(a, b));
        File file = new File("output.txt");
        try (PrintWriter out = new PrintWriter(file, StandardCharsets.UTF_8)) {
            out.print(str);
            System.out.println("Successfully written data to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        fr.close();
    }
}
