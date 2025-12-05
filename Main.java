package ua;

import ua.model.*;
import ua.util.LibraryUtils;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AccessLevel level = AccessLevel.PREMIUM;

        Author a1 = new Author("Mark", "Twain", 1835);
        Reader r1 = new Reader("John", "Smith", "R001", level);

        FileResource file1 = new FileResource("http://book.com/file.pdf", "PDF", 2.5);
        EBook ebook = new EBook("Tom Sawyer", List.of(a1), "ISBN-11", List.of(file1));

        System.out.println("=== Дані читача ===");
        System.out.println(r1);
        System.out.println("Рівень доступу: " + level);

        System.out.println("Опис доступу: " + LibraryUtils.accessDescription(level));
        System.out.println("Ліміт книг: " + LibraryUtils.computeLimit(level));

        System.out.println("\n=== Демонстрація switch-case ===");
        switch (level) {
            case BASIC -> System.out.println("Читач має базовий доступ");
            case PREMIUM -> System.out.println("Читач має розширений доступ");
            case VIP -> System.out.println("Читач має VIP доступ");
        }

        System.out.println("\n=== Дані книги ===");
        System.out.println(ebook);
    }
}
