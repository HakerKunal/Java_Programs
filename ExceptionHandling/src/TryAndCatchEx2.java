

public class TryAndCatchEx2 {
    public static void main(String[] args) {
        try{
            int a=100/0;

        }
        catch(Exception e){
            System.out.println("Error Occured");
            System.out.println(e);
        }
        try{
            int[] arr={1,2,4,5};
            System.out.println(arr[10]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
