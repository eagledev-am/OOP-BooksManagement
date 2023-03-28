/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books.management;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author ABDO
 */
public class Book {
    private int id;
    private String name;
    Author[] authors;
    Publisher publisher;
    int publishingYear;
    int amountOfPages;
    BigDecimal price;
    CoverType coverType;
    
    public Book(){
        
    }

    public Book(int id, String name, Author[] author, Publisher publisher, int publishingYear, int amountOfPages, BigDecimal price, CoverType coverType) {
        this.id = id;
        this.name = name;
        this.authors = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.coverType = coverType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthors (Author[] authors){
        this.authors = authors;
    }
    
    public Author[] getAuthors(){
        return this.authors;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    @Override
    public String toString() {
       return "Book [id=" + id + ", name=" + name + ", authtors" +Arrays.toString(authors) + ", publisher=" 
              + publisher + ", publishingyear=" + publishingYear + ", amount of pages=" + amountOfPages + ", price=" + price 
               +", covertype=" + coverType + "]";
    }

    @Override
    public boolean equals(Object obj) {
       // self check 
       if (this == obj)
           return true;
       // null check 
       if (obj == null)
           return false;
       // type check
       if (getClass() != obj.getClass())
           return false;
       // casting
       Book book = (Book) obj;
       return id == book.id  &&
              name.equals(book.name) || name != null && Objects.equals(name , book.name) &&
              authors == book.authors || authors != null && authors.equals(book.authors) &&
              publisher == book.publisher || publisher!= null && publisher.equals(book.publisher) &&
              publishingYear == book.publishingYear  && amountOfPages == book.amountOfPages && 
              price == book.price || price != null && price.equals(book.price) &&
              coverType == coverType || coverType != null && coverType.equals(book.coverType)
               ;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = result * prime + Arrays.hashCode(authors);
        result = result * prime + Objects.hash(id , name , publisher , publishingYear , amountOfPages , price , coverType );
        return result;
    }
    
    
    
    
}
