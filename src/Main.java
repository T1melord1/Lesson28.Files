import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\Projects\\git\\Lesson 28 Files\\data\\test\\test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
