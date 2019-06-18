package org.store.book_store.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.store.book_store.entities.BookInfo;

import java.util.List;

public interface IBookDao extends JpaRepository<BookInfo, Integer> {

    @Query("Select BookInfo where BookInfo.bookTitle=:bookTitle")
    List<BookInfo> listOfBooks(@Param("bookTitle") String bookTitle);




}
