package com.searchdata.Service.Impl;

import com.searchdata.Entity.BookData;
import com.searchdata.Repository.BookDataRepository;
import com.searchdata.Service.BookDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookDataServiceImpl implements BookDataService {

    @Autowired
    private BookDataRepository bookDataRepository;

    @Override
    public List<BookData> searchBookDataByKeyword(String keyword) {
        String lowercaseKeyword = keyword.toLowerCase();
        List<BookData> results = bookDataRepository.findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(lowercaseKeyword, lowercaseKeyword);
        return results;
    }
}
