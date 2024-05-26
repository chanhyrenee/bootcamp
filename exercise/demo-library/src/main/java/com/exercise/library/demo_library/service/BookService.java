package com.exercise.library.demo_library.service;

import java.util.List;
import java.util.Optional;
import com.exercise.library.demo_library.model.Book;

public interface BookService {
  public Book addBook(int ISBN, String bookName);

  public Optional<Book> getBook(int ISBN);

  public List<Book> searchBook(String bookName);
}
