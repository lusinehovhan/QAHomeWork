package com.company.Exercise14;

public class BookMain {
    public static void main(String[] args) {
        Book bk1 = new Book("Sherlock Holmes", 1999, 40);
        Book bk2 = new Book ("The Lost World", 2000, 55);
        Book bk3 = new Book("War and Peace", 2000, 45);
        Book bk4 = new Book("Anna Karenina", 1995, 100);
        Book bk5 = new Book("Ward N6", 2005, 35);
        Book bk6 = new Book("Kashtanka", 2001, 36);
        Book bk9 = new Book("Hercule Poirot", 2015, 60);
        Book bk8 = new Book("The Duel", 1998, 25);

        Author au1 = new Author("Conan", "Dyle", new Book[]{bk1, bk2});
        Author au2 = new Author("Agata", "Kristi", new Book[]{bk9});
        Author au3 = new Author("Lev", "Tolstoy", new Book[]{bk3, bk4});
        Author au4 = new Author("Anton", "Chekhov", new Book[]{bk6, bk8, bk5});


        Book book4 =  au4.getBook("The Duel");
        if(book4!=null){
            book4.printBook();
        }else {
            System.out.println("The book is not found \n");
        }

        Book book1 =  au1.getBook("Sherlock Hol");
        if(book1!=null){
            book1.printBook();
        }else {
            System.out.println("The book is not found \n");
        }

        Book book2 =  au2.getBook("Hercule Poirot");
        if(book2!=null){
            book2.printBook();
        }else {
            System.out.println("The book is not found \n");
        }

        Book book3 =au3.getBook("War abd Pea");
        if(book3!=null){
            book3.printBook();
        }else {
            System.out.println("The book is not found \n");
        }
    }

}
