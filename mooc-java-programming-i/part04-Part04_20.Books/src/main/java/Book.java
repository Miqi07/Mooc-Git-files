/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Book {

    private String Title;
    private int NoofPages;
    private int publicationyear;

    public Book(String Title, int NoofPages, int publicationyear) {
        this.Title = Title;
        this.NoofPages = NoofPages;
        this.publicationyear = publicationyear;

    }

    public String getTitle() {
        return this.Title;
    }

    public int getNoofPages() {
        return this.NoofPages;
    }

    public int publicationyear() {
        return this.publicationyear;
    }

    @Override
    public String toString() {
        return this.getTitle() + ", " + this.getNoofPages() + " pages, " + this.publicationyear();
    }
}
