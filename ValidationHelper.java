package ua.util;

class ValidationHelper {

    static void requireNotNull(Object value, String field) {
        if (value == null) throw new IllegalArgumentException(field + " cannot be null");
    }

    static void requireNotBlank(String value, String field) {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException(field + " cannot be empty");
    }

    static void requirePositive(int value, String field) {
        if (value <= 0)
            throw new IllegalArgumentException(field + " must be positive");
    }
}
