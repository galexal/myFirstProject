package lesson_11.task_1.animals;

import lesson_11.task_1.food.Food;
import lesson_11.task_1.food.Grass;

public class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            satiety += food.getEnergy();
            System.out.println("Животное накормлено");
        } else {
            System.out.println("Травоядные не едят мясо!");
        }
    }
}
