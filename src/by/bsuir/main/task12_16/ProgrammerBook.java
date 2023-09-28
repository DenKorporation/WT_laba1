package by.bsuir.main.task12_16;

import java.util.Objects;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof ProgrammerBook)) return false;

        ProgrammerBook that = (ProgrammerBook) obj;
        return super.equals(obj) && this.level == that.level &&
                Objects.equals(this.language, that.language);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (language == null ? 0 : language.hashCode());
        result = 31 * result + level;
        return result;
    }

    @Override
    public String toString() {
        return "\"ProgrammerBook\": {" + super.toString() + ", \"language\": \"" + language
                + "\", \"level\": " + level + "}";
    }
}
