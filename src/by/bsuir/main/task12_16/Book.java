package by.bsuir.main.task12_16;

public class Book implements Comparable<Book> {
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    public int getIsbn() {
        return isbn;
    }

    private String title;
    private String author;
    private int price;

    private int isbn;
    private static int edition;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    @Override
    public Object clone() {
        return new Book(title, author, price, isbn);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Book)) return false;

        Book that = (Book) obj;

        return this.title.equals(that.title) && this.author.equals(that.author)
                && this.price == that.price && this.isbn == that.isbn;
    }

    @Override
    public int hashCode() {
        int result = title == null ? 0 : title.hashCode();
        result = 31 * result + (author == null ? 0 : author.hashCode());
        result = 31 * result + price;
        result = 31 * result + isbn;
        return result;
    }

    @Override
    public String toString() {
        return "\"Book\": {\"title\": \"" + title +
                "\", \"author\": \"" + author +
                "\", \"price\": " + price +
                ", \"edition\": " + edition +
                "\", \"isbn\": " + isbn + "}";
    }

    @Override
    public int compareTo(Book o) {
        if (isbn - o.isbn < 0) {
            return -1;
        } else if (isbn == o.isbn) {
            return 0;
        } else {
            return 1;
        }
    }
}
