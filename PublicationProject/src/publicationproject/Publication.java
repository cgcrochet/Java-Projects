
package publicationproject;

enum Genre{SCIENCE, ROMANCE, COMIC, CLASSIC, ATHLETIC, BEAUTY, FASHION, ENTERTAINMENT, THRILLER}

public class Publication implements Comparable<Publication>{
    public String title;
    public Genre genre;
    public int edition;
    public int year;
    
    public Publication(String bookTitle, int bookEdition, Genre bookGenre, int bookYear){
        title = bookTitle;
        genre = bookGenre;
        edition = bookEdition;
        year = bookYear;
    }
    
    public void printInfo(){
        System.out.printf("%s. Edition %d published in %d", title, edition, year);
    }
    
    public void printFooter() {
        System.out.println("All rights reserved.\n--------------------\n");
    }
    
    @Override
    public int compareTo(Publication other) {
        if (genre.toString().compareTo(other.genre.toString()) != 0)
            return genre.toString().compareTo(other.genre.toString());
        else
            return title.compareTo(other.title);
    }
}
