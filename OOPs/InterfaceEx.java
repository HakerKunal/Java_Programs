package javaBasics;

interface FirstInterface{
    public void myMethod();
}
interface SecoundInterface{
    public void myMethod2();
}
class NewClass implements FirstInterface,SecoundInterface{

    @Override
    public void myMethod() {
        System.out.println("first");
    }

    @Override
    public void myMethod2() {
        System.out.println("Secound");

    }
}

public class InterfaceEx  {
    public static void main (String arg[]){
        System.out.println("Pajji Tusi Great HO");
        NewClass obj=new NewClass();
        obj.myMethod();
    }
}
