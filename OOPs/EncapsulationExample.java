import java.util.*;
public class EncapsulationExample {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String nename){
        this.name=nename;
    }
    public static void main(String[] args) {
        EncapsulationExample obj=new EncapsulationExample();
      obj.name="dwada";
        System.out.println(obj.name);
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        int age=input.nextInt();
        System.out.println(name
        );
    }
}
