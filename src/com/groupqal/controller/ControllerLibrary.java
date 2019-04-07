package com.groupqal.controller;

import com.groupqal.model.Book;
import com.groupqal.model.Books;
import com.groupqal.view.Print;


public class ControllerLibrary {
    private Books books;
    private Print print = new Print();


    public void run(){

        print.print("Enter the number of books that can fit in your library --> ");
        books = new Books(Input.input()); //library size
        books.add(new Book("The process", "Frans Kafka", 1999, 256, 3.99));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1867, 682, 7.99));
        books.add(new Book("1984", "George Orwell", 1985, 356, 5.99));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1999, 256, 3.99));

        System.out.println("Choose an option:\n" +
                "1. View all books\n" +
                "2. Change price\n" +
                "3. Find books by author\n" +
                "4. Find books by year of pubishing\n");
        int a = Input.input();
        switch (a){

            case 1: {
                print.print(books.viewLibrary()); //view library
                break;
            }
            case 2: {
                print.print("Enter percent --> ");
                books.changePrice(Input.input());
                print.print(books.viewLibrary());
                break;
            }
            case 3: {
                print.print("Enter the author you want to find --> ");
                books.findAuthor(Input.inputStr());
                break;
            }
            case 4: {
                print.print("Enter year --> ");
                books.findYear(Input.input());
                break;
            }
            default: print.print("You entered wrong number");
        }







    }
}
