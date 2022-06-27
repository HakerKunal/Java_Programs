import java.util.ArrayList;
import java.util.List;

abstract class Shape{
    void draw(){};

}
class Rectangle extends Shape {
    void draw(){
        System.out.println("Drawing Rectangle");
    }

}
class Circle  extends  Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}

public class WildCardWithGenrics {

    public static void drawShaper (List<?extends Shape> lists){
        for (Shape s:lists){
            s.draw();
        }

    }

    public static void main(String[] args) {
        List<Rectangle> rec=new ArrayList<>();
        rec.add(new Rectangle());

        List<Circle> listOfCircle=new ArrayList<>();
        listOfCircle.add(new Circle());
        listOfCircle.add(new Circle());
        drawShaper(listOfCircle);
        drawShaper(rec);


    }
}
