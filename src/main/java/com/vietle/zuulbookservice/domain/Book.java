package com.vietle.zuulbookservice.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
    private int id;
    private String name;
    private String color;
    private String category;
}
