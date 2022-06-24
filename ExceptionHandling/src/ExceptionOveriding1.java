import java.io.IOException;
// Parnet not throwing Child throwing Checked Exception Not allowed
class Parent{
    void message(){
        System.out.println("Parent Method");
    }
}


public class ExceptionOveriding1  extends  Parent{
//    void message() throws IOException{
//        System.out.println();
//    }

    public static void main(String[] args) {
        Parent obj=new ExceptionOveriding1();
        obj.message();
    }
}
