public class ClassPractcie {
    int a=10;
    int b=10;
    void sum(int a,int b){
        System.out.println(this.a+this.b);
    }

    public static void main(String[] args) {
        ClassPractcie myObj=new ClassPractcie();
        System.out.println(myObj.a);
        myObj.sum(1,2);
    }
}
