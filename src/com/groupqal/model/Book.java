package com.groupqal.model;

public class Book {

private static int nextID = 1;
private int id;
private String name;
private String author;
private int yearOfPublishing;
private int numOfPages;
private double price;

    public Book(String name, String author, int yearOfPublishing, int numOfPages, double price) {

        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.numOfPages = numOfPages;
        this.price = price;
    }

    public Book() {
        this.id = nextID++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public String view(){
      return "ID = " + this.id + "; Name = " + name +
              "; Author = " + author + "; Year of publishing = " + yearOfPublishing +
              "; Number of pages = " + numOfPages + "; Price = " + price +";";
    }
    public void changePrice(double percent) {
        this.price = (float) (price + price * percent / 100);
    }
}
