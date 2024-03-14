package lesson_14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = PhoneBook.getInstance();
        phoneBook.addNumber("Ivanov", "12345");
        phoneBook.addNumber("Ivanov", "12345");
        phoneBook.addNumber("Ivanov", "6789");
        System.out.println(phoneBook.getNumber("Ivanov"));
        System.out.println(phoneBook.getNumber("Petrov"));

        Student student1 = new Student("Ivanov", 1);
        Student student2 = new Student("Petrov", 2);
        Student student3 = new Student("Sidorov", 3);
        Student student4 = new Student("Lebedev", 1);
        Student student5 = new Student("Zaykov", 2);
        Student student6 = new Student("Buynov", 3);

        System.out.println(getStudentsFilteredByCourse(student1, student2, student3, student4, student5, student6));
    }

    private static Map<Integer, Set<Student>> getStudentsFilteredByCourse(Student... students) {
        HashMap<Integer, Set<Student>> result = new HashMap<>();
        for (Student student : students) {
            result.putIfAbsent(student.getCourse(), new HashSet<>());
            result.get(student.getCourse()).add(student);
        }
        return result;
    }
}
