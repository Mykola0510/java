package ua.util;

public class Utils {

    public static String capitalize(String text) {
        ValidationHelper.requireNotBlank(text, "capitalize text");
        return text.substring(0,1).toUpperCase() + text.substring(1).toLowerCase();
    }

    public static String join(String... values) {
        return String.join(", ", values);
    }
}
