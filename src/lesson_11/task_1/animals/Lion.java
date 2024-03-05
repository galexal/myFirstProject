package lesson_11.task_1.animals;

public class Lion extends Carnivorous implements Run, Swim, Voice {
    @Override
    public void run() {
        System.out.println("Лев бежит.");
    }

    @Override
    public void swim() {
        System.out.println("Лев плывет.");
    }

    @Override
    public String getVoice() {
        return "Ррр";
    }

}
