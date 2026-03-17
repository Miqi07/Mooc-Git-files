
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object book) {
        if (this == book) {
            return true;
        }
        if (!(this instanceof Book)) {
            return false;
        }
        Book newBook = (Book) book;
       
        return this.name.equals(newBook.name)
                && this.publicationYear == newBook.publicationYear;
    }

}
