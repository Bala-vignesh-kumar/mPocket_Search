package com.searchdata.Controller;

import com.searchdata.Entity.BookData;
import com.searchdata.Mapper.BookDataMapper;
import com.searchdata.Repository.BookDataRepository;
import com.searchdata.Service.BookDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v2/bookData")
public class BookDataController {

    @Autowired
    private BookDataService bookDataService;

    @Autowired
    BookDataMapper bookDataMapper;
    @Autowired
    private BookDataRepository bookDataRepository;

    @GetMapping("/search")
    public ResponseEntity<Map<String, Object>> searchBooks(@RequestParam String keyword) {
        List<BookData> results = bookDataService.searchBookDataByKeyword(keyword);
        int count = results.size();
        String message = count + " posts were found";
        Map<String, Object> response = new HashMap<>();
        response.put("count", message);
        response.put("results", results);
        return ResponseEntity.ok(response);
    }
}
