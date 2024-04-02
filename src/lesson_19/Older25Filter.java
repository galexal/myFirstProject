package lesson_19;

public class Older25Filter implements IFilter{
    @Override
    public boolean test(Student student) {
        return student.getAge() > 25;
    }
}
