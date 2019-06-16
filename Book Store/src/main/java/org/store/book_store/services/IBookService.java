package org.store.book_store.services;

import org.store.book_store.entities.BookInfo;

public interface IBookService {

    BookInfo addBook(BookInfo book);

    BookInfo updateBook(BookInfo book);

    BookInfo deleteBook(BookInfo book);

}
