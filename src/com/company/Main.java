package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>(4);
        addNumbersToNumberList(numberList);
    }

    private static void addNumbersToNumberList(ArrayList<Integer> numberList) {
        try {
            numberList.add(13);
            numberList.add(45);
            numberList.add(104);
            numberList.add(2);
            numberList.add(23);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(numberList);
        }
    }
}
