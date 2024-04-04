import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            long sum = Files.walk(Path.of("D:\\Projects\\git\\Lesson 28 Files"))
                    .map(p -> p.toFile())
                    .filter(f -> f.isFile())
                    .mapToLong(f -> f.length()).sum();
            System.out.println(sum);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
