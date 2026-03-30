package lab4_1;

class MatrixL4i1 {
    private int[][] data; // Двумерный массив целых чисел
    private int rows;     // Количество строк
    private int cols;     // Количество столбцов

    // Конструктор для инициализации матрицы с заданными размерами
    public MatrixL4i1(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }

    // Метод для задания значений матрицы
    public void setMatrix(int[][] newData) {
        if (newData.length == rows && newData[0].length == cols) {
            for (int i = 0; i < rows; i++) {
                System.arraycopy(newData[i], 0, data[i], 0, cols);
            }
        } else {
            System.out.println("Размеры матриц не совпадают!");
        }
    }

    // Метод для сложения с другой матрицей
    public MatrixL4i1 add(MatrixL4i1 other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            System.out.println("Матрицы имеют разные размеры!");
            return null;
        }

        MatrixL4i1 result = new MatrixL4i1(this.rows, this.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    // Метод для умножения матрицы на число
    public MatrixL4i1 multiplyByScalar(int scalar) {
        MatrixL4i1 result = new MatrixL4i1(this.rows, this.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }

    // Метод для вывода матрицы на печать
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%d ", data[i][j]);
            }
            System.out.println();
        }
    }

    // Метод main для тестирования класса
    public static void main(String[] args) {
        MatrixL4i1 matrix1 = new MatrixL4i1(2, 2);
        matrix1.setMatrix(new int[][]{{5, 7}, {3, 4}});

        MatrixL4i1 matrix2 = new MatrixL4i1(2, 2);
        matrix2.setMatrix(new int[][]{{5, 6}, {7, 8}});

        MatrixL4i1 sum = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        sum.print();

        MatrixL4i1 scaled = matrix1.multiplyByScalar(2);
        System.out.println("Матрица после умножения на 2:");
        scaled.print();
    }
}
