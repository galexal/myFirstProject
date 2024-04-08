package lesson_19;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", "Ivanov", 20, 3.5, 1));
        studentList.add(new Student("Petr", "Petrov", 26, 4, 2));
        studentList.add(new Student("Max", "Maximov", 20, 4.9, 3));
        studentList.add(new Student("Sidor", "Sidorov", 30, 4.1, 5));

        System.out.println("Студенты старше 25");
        StudentUtils.filter(studentList, student -> student.getAge() > 25);
        System.out.println();

        System.out.println("Студенты с именем на I");
        StudentUtils.filter(studentList, student -> student.getName().startsWith("I"));
        System.out.println();

        System.out.println("Студенты со средним баллом меньше 4");
        StudentUtils.filter(studentList, student -> student.getAverageRate() < 4);
        System.out.println();

        System.out.println("Студенты пятого курса");
        StudentUtils.filter(studentList, student -> student.getCourse() == 5);
        System.out.println();

        System.out.println("Студенты с именем Петр");
        StudentUtils.filter(studentList, student -> student.getName().equals("Petr"));
        System.out.println();
    }
}
