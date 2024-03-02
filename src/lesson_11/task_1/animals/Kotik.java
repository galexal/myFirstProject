package lesson_11.task_1.animals;

import java.util.Random;

public class Kotik {
    private String name;
    private String voice;
    private int satiety;
    private double weight;
    private final int METHODS = 5;

    private static int count;

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public Kotik() {
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    private boolean doSomething(String behavior) {
        if (satiety > 0) {
            System.out.println("Котик " + behavior + ".");
            satiety--;
            return true;
        } else {
            System.out.println("Котик просит есть.");
            return false;
        }
    }

    public boolean play() {
        return doSomething("играет");
    }


    public boolean sleep() {
        return doSomething("спит");
    }

    public boolean wash() {
        return doSomething("умывается");
    }

    public boolean walk() {
        return doSomething("гуляет");
    }

    public boolean hunt() {
        return doSomething("охотится");
    }

    public void eat(int foodAmount) {
        satiety += foodAmount;
    }

    public void eat(int foodAmount, String foodName) {
        satiety += foodAmount;
    }

    public void eat() {
        eat(5, "рыба");
    }


    public String[] liveAnotherDay() {
        String[] livingLog = new String[24];
        Random random = new Random();
        for (int i = 0; i < 24; i++) {
            String activity = "";
            boolean isWellFed;
            switch (random.nextInt(METHODS)) {
                case 0:
                    isWellFed = play();
                    if (!isWellFed) {
                        eat();
                    }
                    activity = isWellFed ? "играл" : "ел";
                    break;
                case 1:
                    isWellFed = sleep();
                    if (!isWellFed) {
                        eat();
                    }
                    activity = isWellFed ? "спал" : "ел";
                    break;
                case 2:
                    isWellFed = wash();
                    if (!isWellFed) {
                        eat();
                    }
                    activity = isWellFed ? "умывался" : "ел";
                    break;
                case 3:
                    isWellFed = walk();
                    if (!isWellFed) {
                        eat();
                    }
                    activity = isWellFed ? "гулял" : "ел";
                    break;
                case 4:
                    isWellFed = hunt();
                    if (!isWellFed) {
                        eat();
                    }
                    activity = isWellFed ? "охотился" : "ел";
                    break;
            }
            livingLog[i] = i + " - " + activity;
        }
        return livingLog;
    }
}
