package lesson_11.task_1;

import lesson_11.task_1.animals.*;
import lesson_11.task_1.employee.Worker;
import lesson_11.task_1.food.Food;
import lesson_11.task_1.food.Grass;
import lesson_11.task_1.food.Meat;

public class Zoo {
    public static void main(String[] args) {
        Animal cat = new Kotik();
        Animal duck = new Duck();

        Food meat = new Meat();
        Food grass = new Grass();

        Worker worker = new Worker();

        worker.feed(cat, grass);
        worker.feed(duck, grass);
        worker.getVoice((Voice) duck);

        for (Swim animal :
                createPond()) {
            animal.swim();
        }
    }

    private static Swim[] createPond() {
        return new Swim[]{new Duck(), new Kotik(), new Duck()};
    }
}
