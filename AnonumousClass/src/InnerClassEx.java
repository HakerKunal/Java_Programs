public class InnerClassEx {

    class InnerClass{
        int a=10;
        void display(){
            System.out.println("Speaking from inner class");
        }
    }

    public static void main(String[] args) {
        InnerClassEx outerObj=new InnerClassEx();
        InnerClassEx.InnerClass obj=outerObj.new InnerClass();
        obj.display();
    }
}
