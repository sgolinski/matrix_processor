package com.matrices;

import org.omg.CORBA.MARSHAL;

public class Matrix {
    private int height;
    private int width;
    public int[][] matrix;

    Matrix(int height, int width) {
        matrix = new int[height][width];
    }

    public void setMatrix(int[][] arr) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = arr[i][j];
            }
        }

    }


    public int[][] add(Matrix matrice) {
        if (matrice.getHeight() != this.getHeight() || matrice.getHeight() != getWidth()) {
            System.out.println("The operation cannot be performed.");
        }
        int[][] ret = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                ret[i][j] = this.matrix[i][j] + matrice.matrix[i][j];
            }
        }
        return ret;
    }

    public int[][] multiply(Matrix matrice) {
        if (matrice.getHeight() != this.getHeight() || matrice.getWidth() != getWidth()) {
            System.out.println("The operation cannot be performed.");
        }
        int[][] ret = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                ret[i][j] = this.matrix[i][j] * matrice.matrix[i][j];
            }
        }
        return ret;
    }

    public void multiplyByConstant(int factor) {
        int[][] ret = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                this.matrix[i][j] = factor * matrix[i][j];
            }
        }
    }

    public int[][] divide(Matrix matrice) {
        if (matrice.getHeight() != this.getHeight() || matrice.getWidth() != getWidth()) {
            System.out.println("The operation cannot be performed.");
        }
        int[][] ret = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                ret[i][j] = this.matrix[i][j] / matrice.matrix[i][j];
            }
        }
        return ret;
    }

    public int[][] substract(Matrix matrice) {
        if (matrice.getHeight() != this.getHeight() || matrice.getHeight() != getWidth()) {
            System.out.println("The operation cannot be performed.");
        }
        int[][] ret = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                ret[i][j] = this.matrix[i][j] - matrice.matrix[i][j];
            }
        }
        return ret;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isEqualToOther(Matrix ma) {
        return this.getWidth() == ma.getWidth() && this.getHeight() == ma.getHeight();
    }

    public void displayArray(int[][] array) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
