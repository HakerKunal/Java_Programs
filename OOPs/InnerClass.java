public class InnerClass {
    int x=10;
    private class NextClass{
        int y=5;

    }

    public static void main(String[] args) {
        InnerClass myOuter=new InnerClass();
        InnerClass.NextClass myInner =myOuter.new NextClass();
        System.out.println(myOuter.x);

    }
}


