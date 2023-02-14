
package publicationproject;


public class Magazine extends Publication{
    
    private String publisher;
    
    public Magazine(String publisherName, String magazineTitle, Genre magazineGenre, int magazineEdition, int magazineYear) {
        super(magazineTitle, magazineEdition, magazineGenre, magazineYear);
        publisher = publisherName;
    }
    
    @Override
    public void printInfo() {
        System.out.printf("%s. Edition (%d) published in %d\n%s book by %s\nAll rights reserved.\n--------------------"
                + "\n", 
                title, edition, year, genre, publisher);
    }
}
