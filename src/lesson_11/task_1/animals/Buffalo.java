package lesson_11.task_1.animals;

public class Buffalo extends Herbivore implements Run, Swim, Voice {
    @Override
    public void run() {
        System.out.println("Бизон бежит.");
    }

    @Override
    public void swim() {
        System.out.println("Бизон плывет.");
    }

    @Override
    public String getVoice() {
        return "Мууу";
    }
}
