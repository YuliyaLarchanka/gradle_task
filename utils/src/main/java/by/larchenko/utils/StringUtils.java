package by.larchenko.utils;
import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str){
        return NumberUtils.isNumber(str) && Double.parseDouble(str) > 0;
    }
}
