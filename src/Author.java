import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSurname;

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAboutAuthor(){
        return this.authorName + " " + this.authorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName) && authorSurname.equals(author.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                '}';
    }
}
