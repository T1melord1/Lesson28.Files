import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("data/test.txt");
        System.out.println(file.length());

        }

    public static void print(File file) {
        if (file.isDirectory()) {
            Arrays.stream(file.listFiles()).forEach(f -> print(f));
        }
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath());
        }
    }

}
