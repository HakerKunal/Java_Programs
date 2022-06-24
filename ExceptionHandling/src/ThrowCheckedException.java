import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowCheckedException {
    public static void read() throws FileNotFoundException {
        FileReader fr = new FileReader("C:\\Coconut.txt");
        BufferedReader fileInput = new BufferedReader(fr);
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try {
            read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
