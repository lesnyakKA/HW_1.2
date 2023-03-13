package org.example;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayUtils {
    private int a;
    private int b;
    private int[][] array;


    public void setArraySize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива А: ");
        this.a = scanner.nextInt();
        System.out.print("Введите размерность массива B: ");
        this.b = scanner.nextInt();
        this.array = new int[a][b];
    }

    public void printArray() {
        System.out.println("Текущий массив (размерность " + this.a + " на " + this.b + ")");
        System.out.println(Arrays.deepToString(array));
    }

    public void addRandomValuesArray() {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                this.array[i][j] = i + j;
            }
        }
    }

    public void turnCurrentArray() {
        int[] tempArray = new int[a * b];
        int count = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(count != tempArray.length) {
                tempArray[count] = array[i][j];
                    count++;
                }
            }
        }
        tempArray[0] = array[a -1][b - 1];

        count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = tempArray[count];
                count++;
            }
        }
      }
}

