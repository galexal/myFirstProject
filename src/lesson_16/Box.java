package lesson_16;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    private List<T> fruitList = new ArrayList<>();

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public double getWeight() {
        return fruitList.size() > 0 ? fruitList.get(0).getWeight() * fruitList.size() : 0;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return Double.compare(getWeight(), box.getWeight()) == 0;
    }

    public void pourInto(Box<T> box) {
        while (!fruitList.isEmpty()) {
            box.addFruit(fruitList.remove(0));
        }
    }
}
