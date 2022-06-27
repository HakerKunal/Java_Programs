import java.util.ArrayList;
import java.util.Iterator;

class Student {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, int age, String name) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;

    }
}

public class ArrayListUserDefine {
    public static void main(String[] args) {
        Student s1 = new Student(1, 13, "Kunal");
        Student s2 = new Student(2, 12, "nikhil");
        Student s3 = new Student(3, 16, "ankit");


        ArrayList<Student> list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator itr= list.iterator();

        while(itr.hasNext()){
            Student st= (Student)itr.next();
            System.out.println(st.age);
        }



    }
}
