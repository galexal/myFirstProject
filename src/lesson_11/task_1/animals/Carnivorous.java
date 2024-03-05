package lesson_11.task_1.animals;

import lesson_11.task_1.food.Food;
import lesson_11.task_1.food.Meat;

public class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            satiety += food.getEnergy();
            System.out.println("Животное накормлено");
        } else {
            System.out.println("Хищники не едят траву!");
        }
    }
}
