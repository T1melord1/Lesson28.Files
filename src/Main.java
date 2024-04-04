import java.io.File;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\Projects\\git\\Lesson 28 Files\\data\\test.txt");
        Date date = new Date(file.lastModified());
        System.out.println(date);
    }
}
