package lesson_19;

public class NameIsPetrFilter implements IFilter{
    @Override
    public boolean test(Student student) {
        return student.getName().equals("Petr");
    }
}
