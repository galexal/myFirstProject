package lesson_11.task_1.animals;

public class Moose extends Herbivore implements Run, Swim, Voice {
    @Override
    public void run() {
        System.out.println("Лось бежит.");
    }

    @Override
    public void swim() {
        System.out.println("Лось плывет.");
    }

    @Override
    public String getVoice() {
        return "Мууу";
    }
}
