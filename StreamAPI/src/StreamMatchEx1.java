import java.util.ArrayList;
import java.util.List;

public class StreamMatchEx1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("kunal");
        list.add("rahul");
        list.add("ruhi");

        Boolean result=list.stream().anyMatch(s->s.startsWith("r"));
        System.out.println(result);


        Boolean result2=list.stream().anyMatch(s->s.startsWith("t"));
        System.out.println(result2);
    }
}
