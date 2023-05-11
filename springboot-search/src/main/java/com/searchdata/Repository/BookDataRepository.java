package com.searchdata.Repository;

import com.searchdata.Entity.BookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDataRepository extends JpaRepository <BookData, Integer>{
    List<BookData> findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String titleKeyword, String descriptionKeyword);
}
