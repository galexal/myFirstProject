package lesson_19;

import java.util.List;
import java.util.function.Predicate;

public class StudentUtils {
    public static void filter(List<Student> list, Predicate<Student> predicate) {
        for (Student student : list) {
            if (predicate.test(student)) {
                System.out.println(student);
            }
        }
    }
}
