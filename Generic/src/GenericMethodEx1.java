public class GenericMethodEx1 {
    public static <E> void printArray(E element){
        System.out.println(element);
    }

    public static void main(String[] args) {
        String str="Kunal";

        printArray(str);
    }
}
