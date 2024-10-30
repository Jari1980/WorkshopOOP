package org.example;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Billy Gate", "Jean Testar");
        Book book2 = new Book("Michel Jackson", "Jean Testar");
        Book book3 = new Book("Macdonalds", "Ikea");
        Book book4 = new Book("Halloween Party", "Jean");

        Person person1 = new Person("Fatemah", "Borrowing Books");
        Person person2 = new Person("Baccardi", "Vodka");

        /*person1.loanBook(book2);
        person1.loanBook(book4);
        System.out.println(person1.getPersonInformation());
        System.out.println("-------------");
        //person2.loanBook(book2);
        //person2.loanBook(book3);
        System.out.println(person2.getPersonInformation());
        System.out.println("-------------");
        person1.returnBook(book4);
        System.out.println(person1.getPersonInformation());

        System.out.println("--------");
        System.out.println(book2.getBookInformation());
        System.out.println(book1.getBookInformation());*/

        //Book book5 = new Book("Test", "Test", person1);

        System.out.println("---------");
        person1.loanBook(book1);
        person1.loanBook(book2);
        person1.loanBook(book3);
        //person2.loanBook(book1);
        System.out.println("------------");
        person1.borrowedBooks();
        System.out.println("--------------");
        person2.borrowedBooks();
        //person1.returnBook(book1);
        System.out.println("----------------");
        person1.returnBook(book3);
        person1.borrowedBooks();
        System.out.println("-----------------");
        System.out.println(person1.getPersonInformation());
        System.out.println("----------");
        person1.borrowedBooks();
        System.out.println("----------------");
        Book book6 = new Book("test", "testtest", person1);
        System.out.println("-----");
        person1.borrowedBooks();
    }
}