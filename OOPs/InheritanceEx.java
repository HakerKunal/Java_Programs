package javaBasics;

class Fruits{
    public String fruitName="Fruit";
    public void taste(){
        System.out.println("Fruits are good in taste");
    }
}
class Mango extends Fruits{
   public String mangoName="Duseri";
   public void taste(){
       System.out.println("Mango taste good");
   }
}


public class InheritanceEx {
    public static void main(String[] args) {
        Mango mangoObj=new Mango();
        System.out.println( mangoObj.mangoName);
        System.out.println(mangoObj.fruitName);
        mangoObj.taste();
    }
}
