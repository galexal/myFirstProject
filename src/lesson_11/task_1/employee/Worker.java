package lesson_11.task_1.employee;

import lesson_11.task_1.animals.Animal;
import lesson_11.task_1.animals.Voice;
import lesson_11.task_1.food.Food;

public class Worker {
    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    public void getVoice(Voice animal) {
        System.out.println(animal.getVoice());
    }
}
