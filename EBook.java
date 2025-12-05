package ua.model;

import ua.util.Utils;
import ua.util.ValidationHelper;
import java.util.List;
import java.util.Objects;

public class EBook {

    private String title;
    private List<Author> authors;
    private String isbn;
    private List<FileResource> files;

    public EBook(String title, List<Author> authors, String isbn, List<FileResource> files) {
        setTitle(title);
        setAuthors(authors);
        setIsbn(isbn);
        setFiles(files);
    }

    public static EBook of(String title, List<Author> authors, String isbn, List<FileResource> files) {
        return new EBook(title, authors, isbn, files);
    }

    public String getTitle() { return title; }
    public void setTitle(String title) {
        ValidationHelper.requireNotBlank(title, "Title");
        this.title = Utils.capitalize(title);
    }

    public List<Author> getAuthors() { return authors; }
    public void setAuthors(List<Author> authors) {
        ValidationHelper.requireNotNull(authors, "Authors");
        this.authors = authors;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) {
        ValidationHelper.requireNotBlank(isbn, "ISBN");
        this.isbn = isbn;
    }

    public List<FileResource> getFiles() { return files; }
    public void setFiles(List<FileResource> files) {
        ValidationHelper.requireNotNull(files, "Files");
        this.files = files;
    }

    @Override
    public String toString() {
        return "EBook{title='%s', isbn='%s'}".formatted(title, isbn);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EBook ebook)) return false;
        return Objects.equals(isbn, ebook.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
