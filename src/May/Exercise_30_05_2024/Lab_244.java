package May.Exercise_30_05_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_244 {
    public static void main(String[] args) {
//        List<Integer> mymarks = new ArrayList<>();
//        mymarks.add(91);
//        mymarks.add(87);
//        mymarks.add(80);
//        Collections.sort(mymarks);
//        System.out.println(mymarks);


        Student student1 = new Student(1,"Pramod");
        Student student2 = new Student(10,"Dutta");
        Student student3 = new Student(3,"Ashish");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);
        Collections.sort(students,new SortByIdAsc());
        System.out.println(students);

   }
}
