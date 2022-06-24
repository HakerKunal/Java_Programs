interface Drawable{
    void draw();
}

class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}
class Circle implements Drawable{
    public void draw(){System.out.println("drawing circle");}
}
public class InterfaceEx2 {
    public static void main(String[] args) {
        Drawable d=new Circle();
        d.draw();
        Drawable d2=new Rectangle();
        d2.draw();
    }
}
