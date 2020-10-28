package com.matrices;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add matrices\n" +
                    "2. Multiply matrix by a constant\n" +
                    "3. Multiply matrices\n" +
                    "4. Transpose matrix\n" +
                    "5. Calculate a determinant\n" +
                    "6. Inverse matrix\n" +
                    "0. Exit");
            System.out.println("Your choice:");
            int action = sc.nextInt();

            switch (action) {
                case 1:
                    double[][] arrayOne;
                    double[][] arrayTwo;
                    int height;
                    int heightTwo;
                    int width;
                    int widthTwo;
                    System.out.print("Enter size of first matrix:");
                    height = sc.nextInt();
                    width = sc.nextInt();

                    arrayOne = new double[height][width];
                    System.out.println("Enter first matrix:");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            arrayOne[i][j] = sc.nextDouble();
                        }
                    }

                    System.out.print("Enter size of second matrix:");
                    heightTwo = sc.nextInt();
                    widthTwo = sc.nextInt();
                    arrayTwo = new double[height][width];
                    System.out.println("Enter second matrix:");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            arrayTwo[i][j] = sc.nextDouble();
                        }
                    }
                    if (height == heightTwo && width == widthTwo) {
                        System.out.println("The result is:");
                        for (int i = 0; i < height; i++) {
                            for (int j = 0; j < width; j++) {
                                System.out.print(arrayOne[i][j] + arrayTwo[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("The operation cannot be performed.");
                    }

                    break;

                case 2:
                    double[][] arr;
                    int heightM;
                    int widthM;

                    System.out.print("Enter size of first matrix:");
                    heightM = sc.nextInt();
                    widthM = sc.nextInt();

                    arr = new double[heightM][widthM];
                    System.out.println("Enter first matrix:");
                    for (int i = 0; i < heightM; i++) {
                        for (int j = 0; j < widthM; j++) {
                            arr[i][j] = sc.nextDouble();
                        }
                    }
                    System.out.println("Enter constant:");
                    String factor = sc.next();

                    System.out.println("The result is:");
                    for (int i = 0; i < heightM; i++) {
                        for (int j = 0; j < widthM; j++) {
                            System.out.print(arr[i][j] * Double.parseDouble(factor) + " ");
                        }
                        System.out.println();
                    }
                    break;


                case 3:
                    double[][] arrayO;
                    double[][] arrayT;
                    int heightO;
                    int heightT;
                    int widthO;
                    int widthT;
                    System.out.print("Enter size of first matrix:");
                    heightO = sc.nextInt();
                    widthO = sc.nextInt();

                    arrayO = new double[heightO][widthO];
                    System.out.println("Enter first matrix:");
                    for (int i = 0; i < heightO; i++) {
                        for (int j = 0; j < widthO; j++) {
                            arrayO[i][j] = sc.nextDouble();
                        }
                    }

                    System.out.print("Enter size of second matrix:");
                    heightT = sc.nextInt();
                    widthT = sc.nextInt();
                    arrayT = new double[heightT][widthT];
                    System.out.println("Enter second matrix:");
                    for (int i = 0; i < heightT; i++) {
                        for (int j = 0; j < widthT; j++) {
                            arrayT[i][j] = sc.nextDouble();
                        }
                    }

                    System.out.println("The result is:");
                    double sum = 0;
                    for (int i = 0; i < heightO; i++) {
                        for (int j = 0; j < widthT; j++) {
                            for (int k = 0; k < widthO; k++) {
                                sum += arrayO[i][k] * arrayT[k][j];
                            }
                            System.out.print(sum + " ");
                            sum = 0;
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("1. Main diagonal\n" +
                            "2. Side diagonal\n" +
                            "3. Vertical line\n" +
                            "4. Horizontal line");

                    int actionTr = scanner1.nextInt();

                    double[][] arrTr;
                    int heightTr;
                    int widthTr;

                    System.out.print("Enter size of first matrix:");
                    heightTr = scanner1.nextInt();
                    widthTr = scanner1.nextInt();

                    arrTr = new double[heightTr][widthTr];
                    System.out.println("Enter first matrix:");
                    for (int i = 0; i < heightTr; i++) {
                        for (int j = 0; j < widthTr; j++) {
                            arrTr[i][j] = scanner1.nextDouble();
                        }
                    }

                    double[][] retArr = choseDiagonal(actionTr, heightTr, widthTr, arrTr);
                    System.out.println("The result is:");
                    display(heightTr, widthTr, retArr);
                    break;

                case 5:
                    double[][] arrD;
                    int heightD;
                    int widthD;

                    System.out.print("Enter size of first matrix:");
                    heightD = sc.nextInt();
                    widthD = sc.nextInt();

                    arrD = new double[heightD][widthD];
                    System.out.println("Enter first matrix:");
                    for (int i = 0; i < heightD; i++) {
                        for (int j = 0; j < widthD; j++) {
                            arrD[i][j] = sc.nextDouble();
                        }
                    }
                    System.out.println("The result is:");
                    System.out.println(determinantOfMatrix(arrD, heightD));
                    break;
                case 6:
                    double[][] arrI;
                    int heightI;
                    int widthI;

                    System.out.print("Enter size of first matrix:");
                    heightI = sc.nextInt();
                    widthI = sc.nextInt();

                    arrI = new double[heightI][widthI];
                    System.out.println("Enter first matrix:");
                    for (int i = 0; i < heightI; i++) {
                        for (int j = 0; j < widthI; j++) {
                            arrI[i][j] = sc.nextDouble();
                        }
                    }
                    System.out.println("The result is:");
                    display(heightI, widthI, invert(arrI));
                    break;

                case 0:
                    System.exit(1);
            }


        }
    }


    static double[][] choseDiagonal(int action, int height, int width, double[][] arr) {
        switch (action) {
            case 1:
                return unpackStackToArr(height, width, mainDiagonal(height, width, arr));
            case 2:
                return unpackStackToArr(height, width, sideDiagonal(height, width, arr));
            case 3:
                return unpackStackToArr(height, width, verticalDiagonal(height, width, arr));
            case 4:
                return unpackStackToArr(height, width, horizontalDiagonal(height, width, arr));
        }
        return null;
    }

    static Queue<Double> mainDiagonal(int height, int width, double[][] arr) {

        Queue<Double> queue = new ArrayDeque<Double>();

        for (int i = 0; i < height; i++) { // is sie zwieksza
            for (int j = 0; j < width; j++) {
                queue.add(arr[j][i]);
            }

        }
        return queue;
    }

    static Queue<Double> sideDiagonal(int height, int width, double[][] arr) {

        Queue<Double> queue = new ArrayDeque<Double>();

        for (int i = height - 1; i >= 0; i--) {
            for (int j = width - 1; j >= 0; j--) {
                queue.add(arr[j][i]);
            }
        }
        return queue;

    }


    static Queue<Double> verticalDiagonal(int height, int width, double[][] arr) {
        Queue<Double> queue = new ArrayDeque<Double>();

        for (int i = 0; i < height; i++) {
            for (int j = width - 1; j >= 0; j--) {
                queue.add(arr[i][j]);
            }
        }
        return queue;
    }


    static Queue<Double> horizontalDiagonal(int height, int width, double[][] arr) {
        Queue<Double> queue = new ArrayDeque<Double>();

        for (int i = height - 1; i >= 0; i--) {
            for (int j = 0; j < width; j++) {
                queue.add(arr[i][j]);
            }
        }
        return queue;
    }


    static double[][] unpackStackToArr(int height, int width, Queue<Double> queue) {
        double[][] returnArr = new double[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                returnArr[i][j] = queue.remove();
            }

        }

        return returnArr;
    }



    static void display(int height, int width, double[][] arr) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void getCofactor(double mat[][], double temp[][],
                            int p, int q, int n) {
        int i = 0, j = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {

                if (row != p && col != q) {
                    temp[i][j++] = mat[row][col];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    static double determinantOfMatrix(double mat[][], int n) {
        double D = 0; // Initialize result

        if (n == 1)
            return (float) mat[0][0];
        double temp[][] = new double[n][n];

        int sign = 1;

        for (int f = 0; f < n; f++) {

            getCofactor(mat, temp, 0, f, n);
            D += sign * mat[0][f]
                    * determinantOfMatrix(temp, n - 1);

            sign = -sign;
        }

        return D;
    }


    public static double[][] invert(double a[][]) {
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i = 0; i < n; ++i)
            b[i][i] = 1;

        gaussian(a, index);

        for (int i = 0; i < n - 1; ++i)
            for (int j = i + 1; j < n; ++j)
                for (int k = 0; k < n; ++k)
                    b[index[j]][k]
                            -= a[index[j]][i] * b[index[i]][k];

        for (int i = 0; i < n; ++i) {
            x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
            for (int j = n - 2; j >= 0; --j) {
                x[j][i] = b[index[j]][i];
                for (int k = j + 1; k < n; ++k) {
                    x[j][i] -= a[index[j]][k] * x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        return x;
    }

    public static void gaussian(double a[][], int index[]) {
        int n = index.length;
        double c[] = new double[n];

        for (int i = 0; i < n; ++i)
            index[i] = i;

        for (int i = 0; i < n; ++i) {
            double c1 = 0;
            for (int j = 0; j < n; ++j) {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) c1 = c0;
            }
            c[i] = c1;
        }

        int k = 0;
        for (int j = 0; j < n - 1; ++j) {
            double pi1 = 0;
            for (int i = j; i < n; ++i) {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }

            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i = j + 1; i < n; ++i) {
                double pj = a[index[i]][j] / a[index[j]][j];
                a[index[i]][j] = pj;
                for (int l = j + 1; l < n; ++l)
                    a[index[i]][l] -= pj * a[index[j]][l];
            }
        }
    }
}


