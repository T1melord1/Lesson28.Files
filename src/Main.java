import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\Projects\\git\\Lesson 28 Files\\data\\test");
        file.mkdir();
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
