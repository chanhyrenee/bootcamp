package com.exercise.library.demo_library.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exercise.library.demo_library.config.AppConfig;
import com.exercise.library.demo_library.model.Book;
import com.exercise.library.demo_library.service.BookService;

@Service
public class BookServiceImpl implements BookService {

  @Autowired
  private AppConfig appConfig;

  @Override
  public Book addBook(int ISBN, String bookName) {
    for (Book book : appConfig.getBooks()) {
      if (book.getISBN() == ISBN) {
        System.out.println("Rejected due to duplicate ISBN");
        return null;
      }
    }
    Book newBook = new Book(ISBN, bookName);
    appConfig.getBooks().add(newBook);
    return newBook;
  }

  @Override
  public Optional<Book> getBook(int ISBN) {
    return appConfig.getBooks().stream().filter(e -> e.getISBN() == ISBN)
        .findFirst();
  }

  @Override
  public List<Book> searchBook(String bookName) {
    return appConfig.getBooks().stream()
        .filter(
            e -> e.getBookName().toLowerCase().contains(bookName.toLowerCase()))
        .collect(Collectors.toList());
  }
}
