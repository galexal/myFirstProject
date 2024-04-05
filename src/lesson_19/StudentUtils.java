package lesson_19;

import java.util.List;

public class StudentUtils {
    public static void filter(List<Student> list, IFilter filter) {
        for (Student student : list) {
            if (filter.test(student)) {
                System.out.println(student);
            }
        }
    }
}
