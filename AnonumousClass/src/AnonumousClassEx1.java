class Parent {
    void message() {
        System.out.println("From PArent Class");
    }
}

public class AnonumousClassEx1 {
    public void createClass() {
        Parent p = new Parent() {
            public void message() {
                System.out.println("From Inner Class");
            }
        };
        p.message();
    }

    public static void main(String[] args) {
        AnonumousClassEx1 obj = new AnonumousClassEx1();
        obj.createClass();
    }
}