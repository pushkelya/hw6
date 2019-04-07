package com.groupqal.model;

import com.groupqal.model.Book;
import com.groupqal.controller.Input;

public class Books {
    private int counter = 0;
    private Book[] library;

    public Book[] getLibrary() {
        return library;
    }

    public void setLibrary(Book[] library) {
        this.library = library;
    }

    public Books(){
    }
    public Books(int libSize) {
        this.library = new Book[libSize];
    }
    public void arrayLib() {

        Books lib = new Books(6);

        lib.add(new Book("The process", "Frans Kafka", 1999, 256, 3.99));
        lib.add(new Book("Pride and Prejudice", "Jane Austen", 1867, 682, 7.99));
        lib.add(new Book("1984", "George Orwell", 1985, 356, 5.99));
        lib.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1999, 256, 3.99));

    }
    public boolean add(Book book){
        if (counter >= library.length){
    System.out.println("You can't add a book");
        return false;
    }
            library[counter++] = book;
        return true;
    }
    public String viewLibrary(){
        if(counter == 0){
            System.out.println("No books in the library!");
        }
            String books = "";
            for(int i = 0; i < counter; i++){
                books += library[i].view();
                books += "\n";
            }
        return books;
    }
    public void changePrice(float percent){
        System.out.println("Change price by " + percent + " %");
        for (int i = 0;i < counter; i++){
            library[i].changePrice(percent);
        }
    }
    public Books findAuthor(String author){
        Books foundBooks = new Books(counter);
        for (int i = 0; i < counter; i++){
            if(library[i].getAuthor().equalsIgnoreCase(author)){
               foundBooks.add(library[i]);
            }
        }
        return foundBooks;
    }

    public Books findYear(int year){
        Books foundBooks = new Books(counter);
        for( int i = 0; i < counter; i++){
            if(library[i].getYearOfPublishing() > year){
                foundBooks.add(library[i]);
            }
        }
        return foundBooks;
    }





}
