import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream(new File("data/test.txt"));
            for(;;){
                try {
                    int code = fis.read();
                    if(code < 0){
                        break;
                    }
                    char ch = (char) code;
                    System.out.print(ch);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
