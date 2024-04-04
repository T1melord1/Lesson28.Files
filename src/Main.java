import java.io.File;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\Projects\\git\\Lesson 28 Files\\data\\test.txt");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

    }
}
