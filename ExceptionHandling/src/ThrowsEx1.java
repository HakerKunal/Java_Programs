import java.io.IOException;

public class ThrowsEx1 {
    void m() throws IOException{
        throw new IOException("Input Exception!!!!!!!!!!!");
    }
    void n() throws  IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThrowsEx1 obj=new ThrowsEx1();
        obj.p();
    }
}
