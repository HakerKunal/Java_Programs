interface Eatable {
    void display();
}

public class AnonumousClassFromInterface {
    public static void main(String[] args) {
        Eatable et = new Eatable() {
            @Override
            public void display() {
                System.out.println("Hello from inner class");
            }
        };et.display();
    }
}
