package org.store.book_store.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.store.book_store.controllers.AdminRestController;
import org.store.book_store.dao.IBookDao;
import org.store.book_store.entities.BookInfo;

public class BookServiceImpl implements IBookService{

    private static final Logger Log = LoggerFactory.getLogger(BookServiceImpl.class);


    @Autowired
    IBookDao bookDao;

    public BookServiceImpl(){

    }


    @Override
    public BookInfo addBook(BookInfo book) {

        Log.info("Inside Add Book Method");

        book = bookDao.save(book);


        return book;
    }

    @Override
    public BookInfo updateBook(BookInfo book) {

        Log.info("Inside Update Book");

        book = bookDao.save(book);

        return book;
    }

    @Override
    public BookInfo deleteBook(BookInfo book) {

        Log.info("Inside Delete Book");

        bookDao.delete(book);


        return book;
    }
}
