package by.larchenko.utils;

public class Utils {
    public static boolean isAllPositiveNumbers(String... strings) {
        for (String str : strings) {
            if (!StringUtils.isPositiveNumber(str)) {
                return false;
            }
        }
        return true;
    }
}
