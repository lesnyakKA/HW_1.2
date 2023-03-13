package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

        arrayUtils.setArraySize();
        arrayUtils.addRandomValuesArray();
        arrayUtils.printArray();
        arrayUtils.turnCurrentArray();
        arrayUtils.printArray();
    }
}