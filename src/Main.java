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
            Files.walk(Path.of("D:\\Projects\\git\\Lesson 28 Files"))
                    .map(p -> p.toFile()).filter(f -> f.isFile()).forEach(f -> System.out.println(f));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
