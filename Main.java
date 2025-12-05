package ua;

import ua.model.*;
import ua.model.enums.*;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Author a1 = new Author("Mark", "Twain", 1835);
        Reader r1 = new Reader("John", "Smith", "RD001");

        FileResource file = new FileResource(
                "http://ebook.com/book.pdf",
                EBookFormat.PDF,
                2.5,
                EBookType.PUBLIC
        );

        EBook ebook = EBook.of(
                "adventures of tom sawyer",
                List.of(a1),
                "ISBN-12345",
                List.of(file)
        );

        System.out.println(ebook);

        LibraryAccess la = LibraryAccess.create(
                r1,
                ebook,
                LocalDate.now(),
                LocalDate.now().plusDays(7)
        );

        System.out.println(la);

        try {
            ebook.setTitle(" ");
        } catch (Exception e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}
