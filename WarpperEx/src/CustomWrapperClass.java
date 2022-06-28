class CustomWrapper{
    private int i;
    CustomWrapper(){}
    CustomWrapper(int i){
        this.i=i;
    }
    public int getValue(){
        return i;
    }

    public void setValue(int i){
        this.i=i;
    }

    public String toString(){
        return Integer.toString(i);
    }
}


public class CustomWrapperClass {
    public static void main(String[] args) {
        CustomWrapper obj=new CustomWrapper(10);
        System.out.println(obj);


    }
}
