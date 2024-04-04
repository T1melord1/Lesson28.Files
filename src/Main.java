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

        List<String> strings = new ArrayList<>();
        for (int i = 0; i <= 100 ; i++) {
            strings.add(String.valueOf(i));
        }

        try {
            Files.write(Path.of("data/test.txt"), strings);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
