package com.akolesnyk;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Написать метод который проверяет число простое или нет. Если нет вывести все его делители.
        System.out.println(isPrimeNumber(20));

    }

    public static ArrayList<Integer> isPrimeNumber(int number) {
        int countDivisor = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                list.add(i);
                countDivisor++;
            }
        }
        if (countDivisor > 0) {
            return list;
        } else {
            list.clear();
            return list;
        }
    }
}


