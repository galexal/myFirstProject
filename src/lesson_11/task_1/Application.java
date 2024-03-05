package lesson_11.task_1;

import lesson_11.task_1.animals.Kotik;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Kotik vasya = new Kotik("Вася", "Мяу", 10, 5);

        Kotik barsik = new Kotik();
        barsik.setName("Барсик");
        barsik.setVoice("Мур");
        barsik.setSatiety(8);
        barsik.setWeight(4);

        Arrays.stream(vasya.liveAnotherDay()).forEach(System.out::println);

        System.out.printf("Кот %s весит %.2f кг\n",
                barsik.getName(), barsik.getWeight());

        compareVoice(vasya, barsik);

        System.out.println("Количество созданных котов: " + Kotik.getCount());
    }

    private static void compareVoice(Kotik cat1, Kotik cat2) {
        System.out.println("Коты мяукают " + (cat1.getVoice().equals(cat2.getVoice())
                ? "одинаково" : "по-разному"));
    }
}
