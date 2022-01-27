package com.company;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        printIsLeapYear(2022);
        System.out.println();

        int deviceYear = 2016;
        int clientOS = 0;
        printRecommendApplicationVersion(clientOS, deviceYear);
        System.out.println();

        int deliveyDistance = 65;
        calculateAndPrintDeliveryDays(deliveyDistance);
        System.out.println();

        findDuplicates("abccddefgghiijjkk");
        System.out.println();

        int[] arr = new int[]{3, 2, 1, 6, 5};
        reverseArray(arr);
        System.out.println();
    }


    // HomeWork1
    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.print(year + " Високосный");
        } else {
            System.out.print(year + " Не високосный");
        }
    }


    // Homework2
    public static void printRecommendApplicationVersion(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("Lite ");
        }
        System.out.print("версию для ");
        if (clientOS == 0) {
            System.out.print("IOS");
        } else {
            System.out.print("Android");

        }
    }

    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }


    // Homework3
    public static void calculateAndPrintDeliveryDays(int deliveryDistance) {
        int result = 1;
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60) {
            result++;
        }
        System.out.print("Количество дней доставки " + result);
    }


    // Homework 4
    public static void findDuplicates(String duplicate) {
        char[] letters = duplicate.toCharArray();
        for (int i = 1; i < letters.length; i++) {
            if (letters[i] == letters[i - 1]) {
                System.out.println("Found Duplicate " + letters[i]);
                return;
            }
        }
    }

    // Homework5
    public static void reverseArray(int[] arr) {
        int[] intArray = new int[]{3, 2, 1, 6, 5};
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = temp;
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}




