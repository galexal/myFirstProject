package lesson_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
        private static final int size = 10_000_000;

    public static void main(String[] args) {
        calculate();
        calculate(2);
        calculate(10);
    }

    private static void calculate() {
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    private static void calculate(int arrayParts) {
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        List<float[]> arrList = new ArrayList<>();
        for (int i = 0; i < arrayParts; i++) {
            int arrayPartSize = size / arrayParts;
            float[] arrPart = new float[arrayPartSize];
            System.arraycopy(arr, i * arrayPartSize, arrPart, 0, arrayPartSize);
            arrList.add(arrPart);
            if (i == arrayParts - 1 && size % arrayParts != 0) {
                arrayPartSize = size % arrayParts;
                arrPart = new float[arrayPartSize];
                System.arraycopy(arr, (i + 1) * arrayPartSize, arrPart, 0, arrayPartSize);
                arrList.add(arrPart);
            }
        }
        try (ExecutorService executor = Executors.newFixedThreadPool(arrayParts)) {
            for (int j = 0; j < arrList.size(); j++) {
                int jValue = j;
                executor.execute(new Thread(() -> {
                    float[] arrPart = arrList.get(jValue);
                    int i = jValue * (size / arrayParts);
                    for (int k = 0; k < arrPart.length; k++) {
                        arrPart[k] = (float) (arrPart[k] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                        i++;
                    }
                }));
            }
        }
        for (int i = 0; i < arrList.size(); i++) {
            System.arraycopy(arrList.get(i), 0, arr, i * arrList.get(0).length, arrList.get(i).length);
        }
        System.out.println(System.currentTimeMillis() - a);
    }
}
