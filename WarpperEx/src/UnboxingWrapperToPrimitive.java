public class UnboxingWrapperToPrimitive {
    public static void main(String[] args) {
        Integer i=23;
        Float f= (float) 34.4;
        Boolean b=true;

        int primitiveInt=i.intValue();
        float primitiveFloat=f.floatValue();
        boolean primitiveBoolean=b.booleanValue();

        System.out.println(primitiveBoolean);
        System.out.println(primitiveFloat);
        System.out.println(primitiveInt);


    }
}
