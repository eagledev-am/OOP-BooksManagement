/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books.management;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ABDO
 */
public class BookService {

    public Book[] filterBooksByAuthor(Author author, Book[] books) {
        if (author == null || books == null) {
            return new Book[0];
        }
        int numberOfBooks = 0;
        for (Book book : books) {
            for (int i = 0; i < book.authors.length; i++) {
                if (book.authors[i].equals(author)) {
                    numberOfBooks++;
                }
            }

        }
        Book booksOFAuthor[] = new Book[numberOfBooks];
        int index = 0;
        for (Book book : books) {
            for (int i = 0; i < book.authors.length; i++) {
                if (book.authors[i].equals(author)) {
                    booksOFAuthor[index++] = book;
                }
            }

        }
        return booksOFAuthor;
    }

    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
        if (publisher == null || books == null) {
            return new Book[0];
        }
        int amountOfBooks = 0;
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                amountOfBooks++;
            }
        }

        Book[] booksOFPublisher = new Book[amountOfBooks];
        int index = 0;
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                booksOFPublisher[index++] = book;
            }
        }
        return booksOFPublisher;
    }

// methods keeps books with publishing year inclusively. 
    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        if (books == null) {
            return new Book[0];
        }
        int amountOfBooks = 0;
        for (Book book : books) {
            if (book.getPublishingYear() >= yearFromInclusively) {
                amountOfBooks++;
            }
        }
        Book[] booksIncluded = new Book[amountOfBooks];
        int index = 0;
        for (Book book : books) {
            if (book.publishingYear >= yearFromInclusively) {
                booksIncluded[index++] = book;
            }
        }
        return booksIncluded;
    }
}
