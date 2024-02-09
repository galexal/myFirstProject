package lesson_5;

public class Homework5 {
    public static void main(String[] args) {
        int arraySize = 9;

        int[][] leftDiagonalArray = getLeftDiagonalArray(arraySize);
        printTwoDimensionalArray(leftDiagonalArray);
        System.out.println();

        int[][] bothDiagonalArray = getBothDiagonalArray(arraySize);
        printTwoDimensionalArray(bothDiagonalArray);
        System.out.println();

        int[][] rhombusArray = getRhombusArray(arraySize);
        printTwoDimensionalArray(rhombusArray);
        System.out.println();
    }

    private static void printTwoDimensionalArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getLeftDiagonalArray(int arraySize) {
        int[][] array = new int[arraySize][arraySize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    private static int[][] getBothDiagonalArray(int arraySize) {
        int[][] array = new int[arraySize][arraySize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || j == (array.length - 1 - i)) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    private static int[][] getRhombusArray(int arraySize) {
        int[][] array = new int[arraySize][arraySize];
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j >= array[i].length / 2 - i && j <= array[i].length / 2 + i) {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = array.length / 2; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j >= array[i].length / 2 - (array.length - 1 - i)
                        && j <= array[i].length / 2 + (array.length - 1 - i)) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }
}
