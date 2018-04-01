package com.zyw.moonII.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: 书本
 * @Author: zyw
 * @Date: 2018/3/31
 */
@Component
public class Book {

    @Value("${book.name}")
    private String bookName;
    @Value("${book.author}")
    private String bookAuthor;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
