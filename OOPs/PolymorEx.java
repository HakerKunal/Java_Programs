package javaBasics;

class Bird {
    void speak() {
        System.out.println("anything");
    }
}

class Cock extends Bird {
    void speak() {
        System.out.println("Qukdu Quu");
    }
}

class Duck extends Bird {
    void speak() {
        System.out.println("Quack Quack");
    }
}

public class PolymorEx {
    public static void main(String[] args) {
        Bird birdObj = new Bird();
        birdObj.speak();
        Bird cockObj = new Cock();
        cockObj.speak();
        Bird duckObj = new Duck();
        duckObj.speak();
    }
}
