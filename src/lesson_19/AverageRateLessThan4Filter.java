package lesson_19;

public class AverageRateLessThan4Filter implements IFilter{
    @Override
    public boolean test(Student student) {
        return student.getAverageRate() < 4;
    }
}
