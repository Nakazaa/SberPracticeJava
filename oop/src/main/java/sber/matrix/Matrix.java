package sber.matrix;

public class Matrix {

    private final int lines;
    private final int columns;
    private float[][] values;

    public Matrix(int lines, int columns) {
        this.lines = lines;
        this.columns = columns;
        this.values = new float[lines][columns];
    }

    public void getMatrix() {
        for (int line = 0; line < lines; line++) {
            for (int column = 0; column < columns; column++) {
                System.out.print(values[line][column] + " ");
            }
            System.out.println();
        }
    }

    public void setValue(int line, int column, float value) {
        values[line][column] = value;
    }

    public Matrix matrixAdd(Matrix matrix) {
        System.out.println("\nРезультат сложения матриц: ");
        Matrix result = new Matrix(lines, columns);
        for (int line = 0; line < lines; line++) {
            for (int column = 0; column < columns; column++) {
                result.values[line][column] = this.values[line][column] + matrix.values[line][column];
            }
        }
        return result;
    }

    public Matrix matrixScalar(int scalar) {
        System.out.println("\nРезультат умножения матрицы на скаляр: ");
        Matrix result = new Matrix(lines, columns);
        for (int line = 0; line < lines; line++) {
            for (int column = 0; column < columns; column++) {
                result.values[line][column] = this.values[line][column] * scalar;
            }
        }
        return result;
    }

    public Matrix matrixMultiply(Matrix matrix) {
        Matrix result = new Matrix(this.lines, matrix.columns);
        System.out.println("\nРезультат умножения матриц: ");
        for (int cycle1 = 0; cycle1 < this.lines; cycle1++) {
            for (int cycle2 = 0; cycle2 < matrix.columns; cycle2++) {
                for (int cycle3 = 0; cycle3 < this.columns; cycle3++) {
                    result.values[cycle1][cycle2] += this.values[cycle1][cycle3] * matrix.values[cycle3][cycle2];
                }
            }
        }
        return result;
    }

}
