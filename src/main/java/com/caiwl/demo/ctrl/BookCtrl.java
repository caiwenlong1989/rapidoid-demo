package com.caiwl.demo.ctrl;

import com.caiwl.demo.entity.Book;
import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;
import org.rapidoid.annotation.POST;
import org.rapidoid.annotation.Valid;
import org.rapidoid.jpa.JPA;

import java.util.List;

@Controller
public class BookCtrl {
    @GET("/books")
    public List<Book> get() {
        return JPA.of(Book.class).all();
    }

    @POST("/books")
    public Book post(@Valid Book b) {
        return JPA.save(b);
    }
}
