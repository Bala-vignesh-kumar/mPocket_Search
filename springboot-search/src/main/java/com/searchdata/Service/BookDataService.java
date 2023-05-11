package com.searchdata.Service;

import com.searchdata.Entity.BookData;

import java.util.List;

public interface BookDataService {

    List<BookData> searchBookDataByKeyword(String keyword);
}
