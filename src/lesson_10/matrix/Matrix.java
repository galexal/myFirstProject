package lesson_10.matrix;

public class Matrix implements IMatrix {
    private final double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int rowsCount, int columnsCount) {
        if (rowsCount < 1) {
            System.out.println("Некорректное количество строк. Будет установлено значение 1");
            rowsCount = DEFAULT_MATRIX_SIZE;
        }
        if (columnsCount < 1) {
            System.out.println("Некорректное количество столбцов. Будет установлено значение 1");
            columnsCount = DEFAULT_MATRIX_SIZE;
        }
        matrix = new double[rowsCount][columnsCount];
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                output.append(aDouble).append("  ");
            }
            output.append("\n");
        }
        return output.toString();
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        matrix[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (getRows() != otherMatrix.getRows() || getColumns() != otherMatrix.getColumns()) {
            System.out.println("Невозможно сложить матрицы разного размера.");
            return null;
        }
        Matrix resultMatrix = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                resultMatrix.setValueAt(i, j, getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return resultMatrix;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return add(otherMatrix.mul(-1));
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (getColumns() != otherMatrix.getRows()) {
            System.out.println("Невозможно перемножить матрицы данных размеров.");
            return null;
        }
        Matrix resultMatrix = new Matrix(getRows(), otherMatrix.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                double value = 0;
                for (int k = 0; k < getColumns(); k++) {
                    value += getValueAt(i, k) * otherMatrix.getValueAt(k, j);
                }
                resultMatrix.setValueAt(i, j, value);
            }
        }
        return resultMatrix;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix resultMatrix = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                resultMatrix.setValueAt(i, j, getValueAt(i, j) * value);
            }
        }
        return resultMatrix;
    }

    @Override
    public IMatrix transpose() {
        Matrix resultMatrix = new Matrix(getColumns(), getRows());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                resultMatrix.setValueAt(j, i, getValueAt(i, j));
            }
        }
        return resultMatrix;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                setValueAt(i, j, value);
            }
        }
    }

    @Override
    public double determinant() {
        if (getRows() != 2 || getColumns() != 2) {
            System.out.println("Этот метод умеет только вычислять детерминант матрицы 2 на 2");
            return 0;
        }
        return getValueAt(0, 0) * getValueAt(1, 1)
                - getValueAt(0, 1) * getValueAt(1, 0);
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (i == j && getValueAt(i, j) != 1) {
                    return false;
                }
                if (i != j && getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        return getRows() == getColumns();
    }

    @Override
    public void printToConsole() {
        System.out.println(this);
    }
}
