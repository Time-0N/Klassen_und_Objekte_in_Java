public class Book {
    private String title;
    private String author;
    private int isbn;

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "{ Book" +
                "title: " + title + " " +
                "| author: " + author + " " +
                "| isbn: }" + isbn;
    }
}
