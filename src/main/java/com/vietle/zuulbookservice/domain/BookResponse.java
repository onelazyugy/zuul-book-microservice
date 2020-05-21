package com.vietle.zuulbookservice.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookResponse {
    private boolean success;
    private String message;
    private Book book;
}
