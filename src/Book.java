public class Book {
    private final String bookName;
    private final Author author;
    private int publicationYear;

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Book(String bookName, Author author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String allInfo(){
        return "Книга: " + this.bookName + " Автор: " + this.author.getAboutAuthor() + " Год публикации: " + this.publicationYear;
    }
}
