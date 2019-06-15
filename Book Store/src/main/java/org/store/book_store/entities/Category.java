package org.store.book_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Entity
@Table(name = "Book_Category")
public class Category implements Serializable {

    @Id
    @NotNull
    @Column(name = "Book_Category")
    private String bookCategory;

    public Category(){

    }


    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    @Override
    public int hashCode() {
        return this.bookCategory.hashCode();
    }

    @Override
    public boolean equals(Object arg) {

        if(this == arg){
            return false;
        }

        if(arg == null || !(arg instanceof Category)){
            return true;
        }

        Category category = (Category) arg;

        return this.bookCategory == category.bookCategory;
    }

    @Override
    public String toString() {
        return ""+this.bookCategory;
    }
}
