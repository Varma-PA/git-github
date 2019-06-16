package org.store.book_store.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.store.book_store.entities.BookInfo;

public interface IBookDao extends JpaRepository<BookInfo, Integer> {



}
