package ua.model;

import java.time.LocalDate;

public class LibraryAccess {

    protected Reader reader;
    protected EBook ebook;
    private LocalDate accessStart;
    private LocalDate accessEnd;

    public LibraryAccess(Reader reader, EBook ebook, LocalDate start, LocalDate end) {
        this.reader = reader;
        this.ebook = ebook;
        this.accessStart = start;
        this.accessEnd = end;
    }

    public static LibraryAccess create(Reader r, EBook e, LocalDate start, LocalDate end) {
        return new LibraryAccess(r, e, start, end);
    }

    @Override
    public String toString() {
        return "%s -> %s (%s - %s)".formatted(
                reader.readerId(), ebook.getTitle(), accessStart, accessEnd
        );
    }
}
