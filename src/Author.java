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
}
