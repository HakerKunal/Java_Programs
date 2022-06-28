import javax.swing.plaf.synth.SynthOptionPaneUI;

public class GenericMethodEx2 {
    public static <E> void printArray(E[] elements){
        for (E elelemnt:elements){
            System.out.println(elelemnt);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray={10,20,30,40,50};
        Character[] charArray={'K','U','N','A','L'};
        System.out.println("Integer Array-");
        printArray(intArray);
        System.out.println("Character Array-");
        printArray(charArray);
    }
}
