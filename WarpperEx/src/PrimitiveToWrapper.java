public class PrimitiveToWrapper {
    public static void main(String[] args) {
        //Primitive to wrapper
        int a=12;
        float b=12.3f;

        Integer i=Integer.valueOf(a);
        System.out.println(i);

        Float f=Float.valueOf(b);
        System.out.println(f);

        boolean c=false;

        Boolean bool=c;
        System.out.println(bool.booleanValue());
    }
}
