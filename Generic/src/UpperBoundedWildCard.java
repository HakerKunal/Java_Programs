import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildCard {
    private static Double add(List<? extends  Number> num){
        Double sum=0.0;
        for(Number n:num){
            sum=sum+n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<Integer>();
        l1.add(11);
        l1.add(67);
        System.out.println("displaying the sum= "+add(l1));

        ArrayList<Double> l2=new ArrayList<Double>();
        l2.add(32.0);
        l2.add(41.0);
        System.out.println("displaying the sum= "+add(l2));
    }
}
