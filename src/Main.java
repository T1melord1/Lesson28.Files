import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            List<String> strings = Files.readAllLines(Path.of("data/test.txt"));
            strings.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
