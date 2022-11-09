public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Stephen", "King");
        Author secondAuthor = new Author("Jeorge", "Orwell");
        Book firstBook = new Book("Dreamcatcher", firstAuthor, 2001);
        Book secondBook = new Book("Animal Farm: A Fairy Story", secondAuthor, 1945);
        secondBook.setPublicationYear(1969);
        System.out.println("secondBook.getPublicationYear() = " + secondBook.getPublicationYear());
        System.out.println("firstBook.allInfo() = " + firstBook.allInfo());
        System.out.println("secondBook.allInfo() = " + secondBook.allInfo());
    }
}