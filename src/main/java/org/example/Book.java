package org.example;

public class Book {
    //Adding fields
    private static int counter = 1; //Static counter to generate unique id to each book
    private int id;
    private String title;
    private String author;
    private boolean available = true;
    private Person borrower;     //Person who borrowed the book

    //Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = counter++;   // Setting unique id and increasing the static counter value
    }

    public Book(String title, String author, Person borrower) {
        this(title, author);
        borrower.loanBook(this);
        //this.setBorrower(borrower);
    }

    public String getBookInformation() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(id);
        sb.append(", title: ");
        sb.append(title);
        sb.append(" ,author: ");
        sb.append(author);
        sb.append(", available: ");
        sb.append(available);
        return sb.toString();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBorrower(Person borrower) {
        this.available = (borrower == null);
        this.borrower = borrower;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Person getBorrower() {
        return borrower;
    }
}
