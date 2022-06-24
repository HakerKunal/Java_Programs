package javaBasics;

public class ConstructorEx {
    int a;
    int b;

    public ConstructorEx(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int product() {
        return this.a * this.b;
    }

    public static void main(String[] args) {
        ConstructorEx myObj=new ConstructorEx(2,3);
        System.out.println(myObj.product());
    }
}
