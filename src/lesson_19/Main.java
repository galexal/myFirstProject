package lesson_19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        List<Student> sortedStudentList = studentList.stream().sorted((student1, student2)->{
            if (student1.getAge() == student2.getAge()) {
                return student1.getName().compareTo(student2.getName());
            }
            return student1.getAge() - student2.getAge();
        }).toList();

        System.out.println("Студенты, отсортированные по возрасту и имени");
        sortedStudentList.forEach(System.out::println);
        System.out.println();

        System.out.println("Карта студентов старше двадцати");
        Map<String, Student> studentMap = studentList.stream().filter(student->student.getAge() > 20)
                .collect(Collectors.toMap(Student::getName, student->student));
        studentMap.forEach((key, value)->System.out.println(key + " : " + value));
        System.out.println();

        System.out.println("Второй студент по возрастанию возраста");
        Student secondStudent = studentList.stream().sorted(Comparator.comparingInt(Student::getAge))
                .skip(1)
                .findFirst().orElse(null);
        System.out.println(secondStudent);
        System.out.println();

        System.out.println("Средний балл всех студентов");
        double avgSum = studentList.stream().map(Student::getAverageRate)
                .reduce(0.0, Double::sum);
        System.out.printf("%.1f\n", avgSum / studentList.size());
    }
}
