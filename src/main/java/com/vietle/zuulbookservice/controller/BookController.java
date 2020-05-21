package com.vietle.zuulbookservice.controller;

import com.vietle.zuulbookservice.domain.Book;
import com.vietle.zuulbookservice.domain.BookRequest;
import com.vietle.zuulbookservice.domain.BookResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @GetMapping("/book")
    public ResponseEntity<BookResponse> book() {
        Book book = Book.builder().category("drama").color("white").id(1).name("brave").build();
        BookResponse response = BookResponse.builder().message("success").success(true).book(book).build();
        ResponseEntity<BookResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
        return responseEntity;
    }

    @PostMapping("/save-book")
    public ResponseEntity<BookResponse> saveProduct(@RequestBody BookRequest bookRequest) {
//        Product product = Product.builder().category("clothing").color("pink").id(1).name("jacket").build();
        BookResponse response = BookResponse.builder().message("success").success(true).book(bookRequest.getBook()).build();
        ResponseEntity<BookResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
        return responseEntity;
    }

}
