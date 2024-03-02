package lesson_11.task_1.animals;

public class Duck extends Herbivore implements Run, Swim, Fly, Voice {
    @Override
    public void run() {
        System.out.println("Утка бежит.");
    }

    @Override
    public void swim() {
        System.out.println("Утка плывет.");
    }

    @Override
    public void fly() {
        System.out.println("Утка летит.");
    }

    @Override
    public String getVoice() {
        return "Кря";
    }

}
