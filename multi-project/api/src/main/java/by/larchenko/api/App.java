package by.larchenko.api;

import by.larchenko.utils.Utils;

public class App {
    public static void main(String[] args) {
        System.out.println("12, 79 = " + Utils.isAllPositiveNumbers("12", "79"));
        System.out.println("123, -123 = " + Utils.isAllPositiveNumbers("123", "-123"));
    }
}
