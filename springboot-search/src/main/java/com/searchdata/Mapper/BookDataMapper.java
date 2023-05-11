package com.searchdata.Mapper;

import com.searchdata.Dto.BookDataDto;
import com.searchdata.Entity.BookData;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookDataMapper {

    public BookDataDto getBookDataDto(BookData bookData){
        return BookDataDto.builder().id(bookData.getId())
                .title(bookData.getTitle())
                .description(bookData.getDescription())
                .dateCreated(bookData.getDateCreated()).build();
    }

    public List<BookDataDto> getBookDataDtoList(List<BookData> bookDatas){
        return bookDatas.stream().map(this::getBookDataDto).collect(Collectors.toList());
    }
}
