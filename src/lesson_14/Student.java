package lesson_14;

import java.util.Objects;

public class Student {
    private static int studentsCounter;

    private int id;
    private String name;
    private int course;
    public Student(String name, int course) {
        id = ++studentsCounter;
        this.name = name;
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && course == student.course && name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, course);
    }
}
