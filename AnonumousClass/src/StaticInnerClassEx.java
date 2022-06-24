public class StaticInnerClassEx {
    static int data=30;
    static class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        StaticInnerClassEx.Inner obj=new StaticInnerClassEx.Inner();
        obj.msg();
    }
}
