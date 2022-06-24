class Motor {
    void method() throws Exception{
        System.out.println("parent Method");
    }
}
public class ExceptionOveriding4 extends Motor{
    void method() throws Exception{
        System.out.println("Child Method");
    }

    public static void main(String[] args) {
        Motor obj=new ExceptionOveriding4();
        try{
            obj.method();
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
