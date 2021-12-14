package StartProject;
import java.util.HashSet;

public class HastSetTest {
    public static void main(String[] args) {
        Student s1 = new Student("小龙女", 23);
        Student s2 = new Student("任盈盈", 24);
        Student s3 = new Student("小龙女", 23);
        Student s4 = new Student("东方不败", 25);
        Student s5 = new Student("伊琳", 29);
        Student s6 = new Student("周芷若", 30);
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        hashSet.add(s5);
        hashSet.add(s6);
        for (Student student : hashSet) {
            System.out.println(student.getName() + "==" + student.getAge());
        }
    }
}
