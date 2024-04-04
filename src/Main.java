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
            Files.copy(Path.of("data/test.txt"), Path.of("data/test2.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
