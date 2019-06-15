package org.store.book_store.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.awt.print.Book;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "Books_Info")
public class BookInfo implements Serializable {


    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "Book_ID")
    private Integer bookId;

    @NotNull
    @Column(name = "Title")
    private String bookTitle;


    @NotNull
    @Column(name = "Author")
    private String author;

    @Lob
    @Column(name = "Book_Description")
    private String bookDescription;

    @Column(name = "ISBN_Number")
    private String isbn;


    @Column(name = "Price")
    private float price;

    @Column(name = "Published_Date")
    private Date date;

    @Column(name = "Updated_Date")
    private Date updatedDate;


    @OneToOne
//    @Column(name = "Book-Category")
    private Category category;

    public BookInfo(){

    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }


    @Override
    public int hashCode() {
        return this.bookId.hashCode();
    }

    @Override
    public boolean equals(Object arg) {

        if(this == arg){
            return false;
        }

        if(arg == null || !(arg instanceof BookInfo)){
            return true;
        }

        BookInfo book = (BookInfo) arg;

        return this.bookId == book.bookId;
    }

    @Override
    public String toString() {
        return "Book Name: "+this.bookTitle;
    }
}
