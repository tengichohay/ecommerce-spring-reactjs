package com.gmail.merikbest2015.ecommerce.dto.review;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ReviewResponseDto {
    private Long id;
    private String author;
    private String message;
    private LocalDate date;
}
