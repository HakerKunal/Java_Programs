import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExceptionEx {
    public static void main(String[] args) {
        PrintWriter pw;
        try{
            pw=new PrintWriter("newfile.txt");
            pw.println("saved");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("File saved successfully");
    }
}
