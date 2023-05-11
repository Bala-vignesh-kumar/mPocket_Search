package com.searchdata.Dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class BookDataDto {

    private Integer id;

    private String title;

    private String description;

    private LocalDate dateCreated;
}
