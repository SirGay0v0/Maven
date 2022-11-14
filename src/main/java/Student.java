/*Создайте 10 экземпляров класса Student
        (добавив поле номер студ билета)
        Поместите Студентов в HashMap, в качестве ключа используйте номер студенческого билета
        Перенесите студентов в List, чей билет начинается с цифры 2
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student extends Study {


    public Student(String name, int studId) {
        super(name, studId);
    }

    public static void main(String[] args) {
        Student[] myStudents = new Student[10];

        for (int i = 0; i < 10; i++) {
            myStudents[i] = new Student("Student №" + (i + 1), (int) (Math.random() * 10000));
        }

        for (Student s : myStudents) {
            System.out.println(s);
        }

        System.out.println("\n");

        HashMap<Integer, Student> studMap = new HashMap<>();
        for (Student stud : myStudents) {
            studMap.put(stud.getStudId(), stud);
        }


        ArrayList<Student> studList = new ArrayList<>();

//        System.out.println("\n");

        for (Map.Entry<Integer, Student> entry : studMap.entrySet()) {
            if (entry.getKey() > 1999 & entry.getKey() < 3000) {
                studList.add(entry.getValue());
            }
        }

        for (Student student : studList) {
            System.out.println(student);
        }
    }
}

