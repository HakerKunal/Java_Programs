package javaBasics;

public class StringEx {
    public static void main(String[] args) {
        String s="Welcome";
        System.out.println(s);
        String s2=new String("Welcome");
        System.out.println(s2);
        String name="kunal";
        name=name.concat(" Batham");
        System.out.println(name);
    }
}

class StringComparsion{
    public static void main(String[] args) {
        String s1="Kunal2";
        String s2="Kunal";
        System.out.println(s1.equals(s2));
//        The == operator compares references not values.
        System.out.println(s1==s2);

        //Compares to
        System.out.println(s1.compareTo(s2));

        StringBuilder str=new StringBuilder("Nikhil");
        str.append("is 12 year old");
        System.out.println(str);
//        String concatenation using format() method

        String combined=String.format("full name is %s %s",s1,s2);
        System.out.println(combined.toString());
    }

}

class SubStringEx {
    public static void main(String[] args) {
        String str="Hello, my name is kunal batham ";
        System.out.println(str.substring(0,4));
        System.out.println(str.trim());
        System.out.println(str.startsWith("He"));
        int a=10;
        System.out.println(a);
        String s=String.valueOf(a);
        System.out.println(s);
    }
}
