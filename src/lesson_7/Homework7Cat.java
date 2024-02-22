package lesson_7;

public class Homework7Cat {
    private String name;
    private int age;
    private String color;

    public Homework7Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Homework7Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Homework7Cat(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.printf("Информация о коте:\n" +
                "Имя: " + (name != null ? name : "нет данных") + "\n" +
                "Возраст: " + (age != 0 ? age : "нет данных") + "\n" +
                "Цвет: " + (color != null ? color : "нет данных") + "\n");
    }

    public void mew() {
        System.out.println("Мяу!");
    }

    public void feed(int foodAmount) {
        if (foodAmount >= 10) {
            System.out.println((name != null ? name : "Кот") + " сытый.");
        } else {
            System.out.println((name != null ? name : "Кот") + " голодный.");
        }
    }
}
