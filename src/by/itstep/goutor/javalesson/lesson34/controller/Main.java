package by.itstep.goutor.javalesson.lesson34.controller;

import by.itstep.goutor.javalesson.lesson34.model.data.WeekDay;
import by.itstep.goutor.javalesson.lesson34.view.Printer;

public class Main {
    public static void main(String[] args) {
        WeekDay monday = new WeekDay();
        WeekDay friday = new WeekDay("Friday", 5);

        WeekDay mars = new WeekDay("Mars", 8);


        System.out.println(monday);
        System.out.println(friday);
    }
}
