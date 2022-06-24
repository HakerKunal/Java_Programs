abstract class Shape{
    abstract int area(int a, int b);
    void name(String name){
        System.out.println("shape is "+name);
    }
}
class Rectangle extends Shape{
     int  area(int a,int b){
        return a*b;
    }
}
public class AbstractionEx {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        System.out.println(obj.area(2,3));
    }
}
