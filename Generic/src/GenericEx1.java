class Test<T>{
    T obj;
    Test(T obj){
        this.obj=obj;
    }
    public T getObjects(){
        return this.obj;
    }
}

public class GenericEx1 {
    public static void main(String[] args) {
        Test<Integer> obj= new Test<Integer>(15);
        System.out.println(obj.getObjects());

        Test<String> obj2=new Test<String>("Kunal");
        System.out.println(obj2.getObjects());
    }

}
