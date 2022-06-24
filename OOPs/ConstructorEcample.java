public class ConstructorEcample {
    int a=10;
    String name="Kuanl";
    public ConstructorEcample(int a,String name){
        a=this.a;
        name=this.name;
    }

    public static void main(String[] args) {
        ConstructorEcample obj=new ConstructorEcample(10,"kunal");
        System.out.println(obj.name);
    }
}
