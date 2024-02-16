package lesson_7;

public class Homework7Main {
    public static void main(String[] args) {
        Homework7Cat cat = new Homework7Cat("Барсик","рыжий");
        cat.printInfo();
        cat.mew();
        cat.feed(5);
        new Homework7Cat("черный").feed(15);
    }
}
