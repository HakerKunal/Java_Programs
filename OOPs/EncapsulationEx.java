package javaBasics;

public class EncapsulationEx {
    private int age;

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }


}

class SecondClass {
    public static void main(String[] args) {
        EncapsulationEx myObj = new EncapsulationEx();
        myObj.setAge(12);
        System.out.println(myObj.getAge());
    }

}
