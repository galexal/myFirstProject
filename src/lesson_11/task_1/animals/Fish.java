package lesson_11.task_1.animals;

public class Fish extends Carnivorous implements Swim {

    @Override
    public void swim() {
        System.out.println("Рыба плывет.");
    }

}
