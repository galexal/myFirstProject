package lesson_10.matrix;

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(new double[][]{{1,2,2},{3,1,1}});
        Matrix matrix2 = new Matrix(new double[][]{{4,2},{3,1,},{1,5}});
        System.out.println(matrix1.mul(matrix2));

        System.out.println(matrix1.transpose());

        matrix2.printToConsole();
    }
}
