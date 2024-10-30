package org.example;

import java.util.ArrayList;    //Started with this, done in 1 hour, all good but then used common array:)
import java.util.Arrays;

public class Person {
    private static int sequenser = 1;
    private int id;
    private String firstName;
    private String lastName;
    private Book[] borrowedBooks ;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowedBooks = new Book[0];
        this.id =  sequenser++;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonInformation(){
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(id);
        sb.append(", firstName: ");
        sb.append(firstName);
        sb.append(" ,lastName: ");
        sb.append(lastName);

        return sb.toString();
    }
    public void borrowedBooks(){
        for(int i = 0; i < borrowedBooks.length; i++){
            System.out.println("Book: " + borrowedBooks[i].getTitle());
        }
    }

    public void returnBook(Book book){
     //Version 2
        for(int i = 0; i < borrowedBooks.length; i++){
            if (borrowedBooks[i].equals(book)) {
                book.setBorrower(null);
                borrowedBooks[i] = null;
                Book[] temp = new Book[borrowedBooks.length - 1];
                int temInt = 0;
                for(int j = 0; j < borrowedBooks.length; j++){
                    if(borrowedBooks[j] != null){
                        temp[temInt++] = borrowedBooks[j];
                    }
                }
                borrowedBooks = temp;
                System.out.println("The book: " + book.getTitle() + " is returned.");
                return;
            }
        }
        System.out.println("Book is not borrowed");
        /*
        //Version 1
        // step1: Check if book is in the array borrowedBooks
        System.out.println("BorrowedBooks lenght: " + borrowedBooks.length);
        boolean isInArray = false;
        for(int i = 0; i < borrowedBooks.length; i++){
            if(borrowedBooks[i].equals(book)){
                isInArray = true;
            }
        }
     // step2: If the book was in borrowedBooks, Create a temporary array with 1 less size
        if(isInArray){
            Book[] temp = new Book[borrowedBooks.length - 1];
            // step3: Looping trough borrowedBooks and adding each book, excluding the book to to return, to temp array
            for(int i = 0, j = 0 ; i < borrowedBooks.length; i++){
                if(!borrowedBooks[i].equals(book)){
                    temp[j++] = borrowedBooks[i];
                }
            }

            // step4: copying temp array to borrowedBooks and setting book available
            borrowedBooks = temp;
            System.out.println("BorrowedBooks length: " + borrowedBooks.length);
            book.setBorrower(null);
        }*/
    }

    public void loanBook(Book book){
        if(book.getBorrower() == null){
            book.setBorrower(this);
            borrowedBooks = Arrays.copyOf(borrowedBooks, borrowedBooks.length + 1);
            borrowedBooks[borrowedBooks.length - 1] = book;
            System.out.println("Borrowed book: " + book.getTitle());
        }
        else{
            System.out.println("Book is unavailable.");
        }
    }
}


