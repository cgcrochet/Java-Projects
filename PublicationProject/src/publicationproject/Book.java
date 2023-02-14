
package publicationproject;


public class Book extends Publication{
    
    String author;
    
    public Book(String authorName, String bookTitle, Genre bookGenre, int bookEdition, int 
    bookYear) {
        super(bookTitle, bookEdition, bookGenre, bookYear);
        author = authorName;
    }
    
    @Override
    public void printInfo() {
        System.out.printf("%s. Edition (%d) published in %d\n%s book by %s\nAll rights reserved.\n--------------------\n", title, edition, year, genre, author);
    }
}
